import java.util.Arrays;

public class FindSubsequenceofLengthKWiththeLargestSum_2099 {
    public static void main(String[] args) {
        int[] nums = {-1,-2,3,4};
        int[] result = maxSubsequence(nums, 3);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        int[] result = new int[k];
        Arrays.sort(nums);
        //System.out.println(nums.length);
        int x = 0;
        int n = nums.length - k;
        System.out.println(nums.length - n);
        if(nums.length == k) return nums;
        for(int i = n; i < nums.length; i++){
            result[x] = nums[i];
            x++;
        }
        return result;
    } 
}
