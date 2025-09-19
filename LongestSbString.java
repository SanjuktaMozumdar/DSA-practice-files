import java.util.HashMap;
import java.util.Map;

public class LongestSbString {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int output = 0;
        System.out.println(longestString(input, output));
    }

    // Bruteforce approch
    public static int longestString(String input, int output){
        int len = input.length()-1;
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            count = 0;
            map.clear();
            for(int j = i; j <= len; j++){
                if (!map.containsKey(input.charAt(j))) {
                map.put(input.charAt(j), 1);
                count++;   
            }
            else break;
            //System.out.println(count);
            }
            if(count > output)
                output = count;
        }  
        return output;
    }

}
