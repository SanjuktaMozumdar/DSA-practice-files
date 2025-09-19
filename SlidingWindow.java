public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println(slide(arr, 3));
    }

    public static int slide(int[] arr, int k){
        int maxSum = 0, windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for(int end = k; end < arr.length; end++){
            windowSum =windowSum + arr[end] - arr[end - k];   //sliding our window to right
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;

    }
}
