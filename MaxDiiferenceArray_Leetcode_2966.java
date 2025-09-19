import java.util.Arrays;

public class MaxDiiferenceArray_Leetcode_2966 {
    public static void main(String[] args) {
        // int[] num = {4,2,9,8,2,12,7,12,10,5,8,5,5,7,9,2,5,11};
        int[] num = {1,3,4,8,7,9,3,5,1};
        divideArray(num, 2);
    }

    public static int[][] divideArray(int[] nums, int k) {

        Arrays.sort(nums);
        int n = nums.length;
        int[][] result = new int[n/3][3];
        int count = 0;
        for (int i = 0; i < n; i += 3) {
            if (nums[i + 2] - nums[i] <= k) {
                result[count][0] = nums[i];
                result[count][1] = nums[i+1];
                result[count][2] = nums[i+2];
            }
            else return new int[0][];
            count++;
        }

        for (int[] is : result) {
            System.out.println(Arrays.toString(is));
        }
        System.out.println(result.length);

        return result;
    }
}
