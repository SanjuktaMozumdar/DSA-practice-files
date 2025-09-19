import java.util.Arrays;

public class Gfg_MinimumPlatforms {
    public static int minPlatform(int arr[], int dep[]) {
        //  code here
        int n = arr.length;
        if(n < 1) return 0;
        if(n == 1) return 1;

        int maxPlatform = 1, platform = 1;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1, j  = 0;
        while(i < n){
            if(arr[i] <= dep[j]){
                platform++;
                i++;
            }
            else{
                platform--;
                j++;
            }
            maxPlatform = Math.max(maxPlatform,platform);
        }

        return maxPlatform;
        
    }
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(minPlatform(arr, dep));
    }
}
