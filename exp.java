public class exp {
    public static void main(String[] args) {
        twoSum(new int[]{3,2,4}, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
       
        return result;
    }
    
}
class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        Map<Character, Integer> pos = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pos.put(s.charAt(i), i);
        }

        int j = 0, k = pos.get(s.charAt(j)), last = j;

        while ( j < n ) {
            if (j < k ) {
                k = Math.max(k, pos.get(s.charAt(j)));
            } else {
                
                j = k + 1;
                if (j < n) {
                    k = pos.get(s.charAt(j));
                }
                res.add(j - last);
                last = j;
            }
            j++;
        }

        return res;
    }
}
