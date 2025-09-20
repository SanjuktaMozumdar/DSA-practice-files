
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordSubsets_916 {
    public static void main(String[] args) {
        String words1[] = { "acaac","cccbb","aacbb","caacc","bcbbb" }, words2[] = { "c","cc","b" };
        //String words1[] = { "aacbb","bcbbb" }, words2[] = { "c","cc","b" };
        wordSubsets(words1, words2);
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        HashMap<Character, Integer> words2Map = words2Map(words2);
        for(String string : words1){
            if (isUniversal(string, words2Map)) {
                res.add(string);
            }
        }
        System.out.println(res);
        return res;
    }
    static Boolean isUniversal(String string, HashMap<Character, Integer> words2Map){
        
        HashMap<Character, Integer> map = new HashMap<>();
            for(Character c : string.toCharArray()){
                map.put(c, map.getOrDefault(c,0) +1);
            }
            for (Character k : words2Map.keySet()) {
                if(!map.containsKey(k) || map.get(k) < words2Map.get(k)) {
                    return false;
                }               
            }
            return true;
    }

    static HashMap<Character,Integer> words2Map(String words2[]){
        HashMap<Character, Integer> map = new HashMap<>();

        for (String string : words2) {
            HashMap<Character, Integer> charMap = new HashMap<>();
            for (Character c : string.toCharArray()) {
                charMap.put(c, charMap.getOrDefault(c, 0) +1);
            }
            for(Character c : charMap.keySet()){
                if(!map.containsKey(c)) map.put(c, charMap.get(c));
                else{
                    map.put(c,Math.max(map.get(c), charMap.get(c)));
                }
            }
        }

        return map;

    }
}
