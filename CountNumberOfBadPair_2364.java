import java.util.HashMap;

public class CountNumberOfBadPair_2364 {
    /* 
        i = element of arr[]
        j = i + 1
        
        A Bad pair is when:
           (i < j) && 
           (j - i) != (nums[j] - nums[i]);      => (j - nums[j]) != (i - nums[i])
           
           therefore pair is a bad pair when at j'th position (idx - val) != i'th (idx - val);

           So, a Good pair will be : (j - nums[j]) == (i - nums[i]).    
            
           Ex:      val[] = [4, 1, 3, 3, 8]
                    idx =    0  1  2  3  4
                 j              i = 0
                (1 - 1 = 0)  != (0 - 4 = -4)     // bad pair
                (2 - 3 = -1) != (0 - 4 = -4)    // bad pair
                (3 - 3 = 0)  != (0 - 4 = -4)     // bad pair
                (4 - 8 = -4) == (0 - 4 = -4)    // Good pair

            Toatal no. of Bad pair = Total no. of pairs - total no. of good pairs
                    
        */
    public static long countBadPairs(int[] nums) {
        long n = nums.length;

        long totalNumberOfPairs = n * ( n - 1 ) / 2;    //Formula for counting total number of pairs
        long goodPairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            int temp = i - nums[i];
            int preVal = map.getOrDefault(temp,0);
            goodPairs += preVal;
            map.put(temp,map.getOrDefault(temp, 0)+1);
        }         
        
        return totalNumberOfPairs - goodPairs;
    }
    public static void main(String[] args) {
        int nums[] = {4, 1, 3, 3, 8};
        System.out.println(countBadPairs(nums));
    }
}
