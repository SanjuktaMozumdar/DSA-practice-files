import java.util.ArrayList;
import java.util.List;

public class Gfg_FirstNegativeInEveryWindowOfSizeK {
    public static void main(String[] args) {
        //int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        //int arr[] = {-8, 2, 3, -6, 10};
        int arr[] = {12, 1, 3, 5};
        int k = 3;
        firstNegInt(arr, k);
    }

    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i <= arr.length-k; i++){
            int count = 0;
            for(int j = i; j < i+k; j++){
                if(arr[j] < 0){
                    count++;
                }
                if(count == 1){
                    res.add(arr[j]);
                    break;
                }                
            }
            if(count == 0)
            res.add(0);
        }
        //System.out.println(res);
        return res;
    }
}
