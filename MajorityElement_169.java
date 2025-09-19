import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = { 2 };
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int result = 0, maxValue = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums.length <= 1) {
                result = nums[0];
            }
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                if (map.get(nums[i]) > maxValue) {
                    maxValue = Math.max(maxValue, map.get(nums[i]));
                    result = nums[i];
                }
            } else
                map.put(nums[i], 1);
        }
        // System.out.println(map);
        // System.out.println(maxValue);
        // result = Collections.max(map.entrySet(),
        // Map.Entry.comparingByValue()).getKey();

        return result;
    }
}
