import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK_560 {
    
    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 7, 2, -3, 1, 4, 2};
        System.out.println(subarraySum(arr, 7));
    }

    public static int subarraySum(int[] nums, int k) {
        int prefixSum = 0, count = 0, target = k, n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i =0; i < n; i++){
            prefixSum += nums[i];
            if(map.containsKey(prefixSum - target)){
                count += map.get(prefixSum - target);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        
        //System.out.println(map);
        return count;
    }
}
