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

        for (String str1 : words1) {
            //System.out.println("for -> " + str1);
            HashMap<Character, Integer> charsInWords1 = new HashMap<>();

            for (Character w : str1.toCharArray()) {
                charsInWords1.put(w, charsInWords1.getOrDefault(w, 0) + 1);
            }

            boolean temp = true;
            for (String str2 : words2) {
                //System.out.println("for char -> " +str2);
                HashMap<Character, Integer> charsInWords2 = new HashMap<>();

                for (Character w : str2.toCharArray()) {
                    charsInWords2.put(w, charsInWords2.getOrDefault(w, 0) + 1);
                }

                for (int i = 0; i < str2.length(); i++) {
                    if (temp == false)
                        break;
                    char c = str2.charAt(i);
                    //System.out.println(" -> "+c);
                    if (!charsInWords1.containsKey(c)) {
                        //System.out.println(c + " is not preset in "+ str1);
                        temp = false;
                        break;
                    }
                    //System.out.println(c + " is present in " + str1);
                    boolean f = charsInWords1.get(c) >= charsInWords2.get(c);
                    //System.out.println(charsInWords1.get(c) + ">= " + charsInWords2.get(c)+ " == " + f);
                    if(!f){
                        temp = false;
                        break;
                    }

                }

            }
            if (temp == true)
                res.add(str1);
        }
        res.stream().forEach(w -> System.out.println(w));

        return res;
    }
}
