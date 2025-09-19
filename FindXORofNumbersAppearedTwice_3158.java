import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindXORofNumbersAppearedTwice_3158 {
    public static void main(String[] args) {
        int[] nums = { 1,2,2,1};
        System.out.println(duplicateNumbersXOR(nums));
    }

    public static int duplicateNumbersXOR(int[] nums) {
        int xor = 0;
        int numsLength = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numsLength; i++) {

            if (numsLength == 1)
                return nums[i];
            if (map.containsKey(nums[i]))
                list.add(nums[i]);

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if(list.size() == 1) return list.get(0);
        for (Integer i : list) {
           xor = xor ^ i;
        }
        // System.out.println(map);
        // System.out.println(list);
        return xor;
    }
}
