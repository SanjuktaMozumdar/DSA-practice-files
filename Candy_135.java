public class Candy_135 {
    public static int candy(int[] ratings) {

        /* Slope Approch Intuition Based */

        int total = 1;
        int n = ratings.length;
        int i = 1;
         
        while(i < n){
            if(ratings[i] == ratings[i-1]){
                total += 1;
                i++;
                continue;
            }
            int peak = 1;
            while (i < n && ratings[i] > ratings[i-1]) {
                peak += 1;
                total += peak;
                i++;
                
            }
            int down = 1;
            while (i < n && ratings[i] < ratings[i-1]) {
                total += down;
                i++;
                down++;
            }

            if(down > peak) total += down-peak;
        }

        return total;
    }

    public static void main(String[] args) {
        //int ratings[] = { 0, 2, 4, 3, 2, 1, 1, 3, 5, 6, 4, 0, 0 };
        int ratings[] = { 1, 0 ,2 };
        System.out.println(candy(ratings));
    }
}
