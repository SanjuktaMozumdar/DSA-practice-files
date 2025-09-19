import java.util.HashSet;

public class HappyNumber_202 {
    public static void main(String[] args) {
        System.out.println(isHappy(33));
    }
    public static boolean isHappy(int n) {        
        int sum = n;
        HashSet<Integer> set = new HashSet<>();
        
        while(set.add(sum)){            
            int b = 0;
            while(sum != 0){
                int a = sum % 10;
                sum = sum / 10;
                b += a * a;               
                
            }
            if(b == 1) {
                //System.out.println(set);
                return true;                
            }
                sum = b;
                b = 0;
        } 
        System.out.println(set);
        //if(happy == 1) result = true;        
        return false;
    }
}
