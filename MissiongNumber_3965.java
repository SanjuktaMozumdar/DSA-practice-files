import java.util.HashMap;
import java.util.Map;

public class MissiongNumber_3965 {

    public static void main(String[] args) {
        int[][] grid = { { 9, 1, 7 }, { 8, 7, 2 }, { 3, 4, 6 } };
        // int[][] grid = { { 1, 3 }, { 2, 2 } };
        int[] result = findMissingAndRepeatedValues(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    /*
     * [[9,1,7],
     * [8,9,2],
     * [3,4,6]]
     */

    /* [[1,3],[2,2]] */

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        int l = grid.length;
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (map.containsKey(grid[i][j])) {
                    result[0] = grid[i][j];
                }
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0)+1);

            }
        }

        for (int i = 1; i <= l * l; i++) {
            if (!map.containsKey(i))
                result[1] = i;
        }
        System.out.println(map);
        
        return result;
    }
}