
import java.util.HashMap;
import java.util.Map;

public class GFG {
    public static void main(String[] args) {
        int[] myArr = {-1, 1, 1, 1, 1, 1, -1, -1, -1};
        System.out.println(maxArray(myArr));
    }
    public static int maxArray(int[] arr){
        int result = 0;
        int n = arr.length;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            sum += arr[i];

            if(sum == 0){
                result = i +1;
            }
            if(map.containsKey(sum)){
                result = Math.max(result, i - map.get(sum));
            }
            else map.put(sum, i);
        }
        return result;
    }
    
}
