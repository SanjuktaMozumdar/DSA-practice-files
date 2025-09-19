public class Candy_135 {
    public static int candy(int[] ratings) {
        int total = 0;
        int n = ratings.length;
        int arr[] = new int[n];
        
        arr[0] = 1;
        for(int i = 1; i < n; i++){
            if(ratings[i-1] < ratings[i]){
                arr[i] = arr[i - 1] + 1;
            }
            else arr[i] = 1;

        }
        total += Math.max(arr[n-1], 1);
		for(int j = n-2; j >= 0; j--){
            if(ratings[j] > ratings[j+1]){
                arr[j] = Math.max(arr[j], arr[j+1] + 1);
            }
            else arr[j] = Math.max(arr[j], 1);
            
            total += arr[j];
        }

        return total;
    }

    public static void main(String[] args) {
        int ratings[] = { 0, 2, 4, 3, 2, 1, 1, 3, 5, 6, 4, 0, 0 };
        System.out.println(candy(ratings));
    }
}
