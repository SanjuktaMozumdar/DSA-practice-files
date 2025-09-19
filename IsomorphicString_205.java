import java.util.HashMap;
import java.util.Map;

public class IsomorphicString_205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "title"));
    }

    public static boolean isIsomorphic(String s, String t) {
        // System.out.println(s.length() + " " + t.length());
        if (s.length() != t.length()) return false;

        int stringLength = s.length();
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < stringLength; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(map.containsKey(sc)){
                if(map.get(sc) != tc) return false;
            }
            else if(map.containsValue(tc)) return false;

            map.put(sc, tc);
        }
        return true;
    }
}
