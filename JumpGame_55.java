public class JumpGame_55 {
    public static void main(String[] args) {
        int nums[] = { 0 };
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int furthest = 0;

        for(int i = 0; i < nums.length; i++ ){
            if(furthest < i) return false;
            int temp = i + nums[i];
            furthest = Math.max(furthest, temp);
            //if(furthest >= nums.length-1) return true;
        }
        //System.out.println(res);

        return true;
    }
}
