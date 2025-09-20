import java.util.HashMap;

public class SubArraySumDivisibleByK_974 {
    public static int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int totalSubArrays = 0, prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < n; i++){
            prefix += nums[i];
            int temp = ((prefix % k) + k) % k;
            if(!map.containsKey(temp)) map.put(temp, 1);
            else{
                totalSubArrays += map.get(temp);
                map.put(temp, map.getOrDefault(temp, 0)+1);
            }
        }

        System.out.println(map);
        return totalSubArrays;
    }
    public static void main(String args[]){
        //int nums[] = {4,5,0,-2,-3,1};
        int nums[] = {-1,2,9};
        int k = 2;
        System.out.println(subarraysDivByK(nums, k));
    }
}
