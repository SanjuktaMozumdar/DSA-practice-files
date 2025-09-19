import java.util.HashMap;

public class LongestPalindrom_409 {
    public static void main(String[] args) {
        String s = "a";
        longestPalindrome(s);
    }

    public static int longestPalindrome(String s) {
        int res = 0;
        boolean isOdd = false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for( Integer v : map.values()){
            if(v % 2 == 0) res += v;
            else{
                res += v - 1;
                isOdd = true;
            }
        }

        return isOdd ? res + 1 : res;
    }


}
