import java.util.HashMap;
import java.util.Map;

public class MinimumDeletionsToMakeStringK_Special_3085 {

    public static void main(String[] args) {
        String word = "dabdcbdcdcd";
        int  k = 2;
        System.out.println(minimumDeletions(word,k));
    }

    public static int minimumDeletions(String word, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String v = String.valueOf(word.charAt(i));
            if (map.containsKey(v)) {
                map.put(v, map.getOrDefault(v, 0)+1);
            }
            else map.put(v, 1);
        }
        System.out.println(map);
        int del = 0, res = Integer.MAX_VALUE;
        for(Map.Entry<String, Integer> m : map.entrySet()){
            int baseRange = m.getValue();
            int maxRange = m.getValue() + k;
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                
                //int temp = Math.abs(m.getValue() - entry.getValue());
                if(entry.getValue() > maxRange){
                    del += entry.getValue() - maxRange;
                }
                else if(entry.getValue() < baseRange){
                    del = entry.getValue();
                }            
            }
            res = Math.min(res, del);            
        }
        System.out.println(res);
        return res;
    }
}