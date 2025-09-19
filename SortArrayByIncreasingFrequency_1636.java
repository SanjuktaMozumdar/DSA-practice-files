import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SortArrayByIncreasingFrequency_1636 {
    public static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        System.out.println(frequencySort(nums));
    }

    public static int[] frequencySort(int[] nums) {
        // Tree Map
        int[] result = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> tempList = new ArrayList<>();
        for(int num : nums){
            tempList.add(num);
        }
       
        tempList.sort((a, b) -> map.get(a) == map.get(b) ? b - a : map.get(a).compareTo(map.get(b)));

        for(int i = 0; i < nums.length; i++){
            result[i] = tempList.get(i);
        }
        // for (int i = 0; i < result.length; i++) {
        //     System.out.print(result[i] + ", ");
        // }
        return result;
    }
}
