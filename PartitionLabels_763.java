import java.util.ArrayList;
import java.util.List;

public class PartitionLabels_763 {
    public static void main(String[] args) {
        String input = "ababcbacadefegdehijhklij";
        // String input = "eccbbbbdec";
        partitionLabels(input);
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < s.length();) {
            int startIndex = i;
            int endIndex = s.lastIndexOf(s.charAt(startIndex));

            for (int j = startIndex + 1; j <= endIndex - 1; j++) {
                int endIndexOfNextChar = s.lastIndexOf(s.charAt(j));

                endIndex = Math.max(endIndex, endIndexOfNextChar);
            }
            res.add(endIndex - startIndex + 1);
            i = endIndex + 1;
        }
        System.out.println(res);
        return res;
    }

}
