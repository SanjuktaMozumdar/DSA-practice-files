public class CountNumberOfBadPair_2364 {
    
    public static long countBadPairs(int[] nums) {
        long output = 0;
        long n = nums.length;


        //This is the brute force solution 
        //It will work completely fine for small inputs
        // T.C - O(N*N) , S.C - 0(1)
        if(n == 1) return 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(i < j && j - i != nums[j] - nums[i]) output += 1;
            }
        }

        return output;
    }
    public static void main(String[] args) {
        int nums[] = {4};
        System.out.println(countBadPairs(nums));
    }
}
