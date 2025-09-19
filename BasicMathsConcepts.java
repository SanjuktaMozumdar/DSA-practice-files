public class BasicMathsConcepts {

    public static void main(String[] args) {
        //digitExtraction(7789);
        // int[] nums  = {1,5,2,10};
        // System.out.println(maximumDifference(nums));
        System.out.println(maxDiff(555));;
    }

    public static void digitExtraction(int number){
        int num = number;
        while(num != 0){
            int result = num % 10;  // returns the last digit -> or the reminder 
            System.out.println(num + " = " + result);   
            num = num/10;         // returns decimal value -> extracting the integer part of it. [778.9 => 778]
        }
         
    }

    public static int maximumDifference(int[] nums) {
        int numLength = nums.length;
        int diff = 0, max = 0;
        int i = 0;
        // Optimized approch
        // Two pointers method
        if(numLength >= 2){
            for(int j = 1; j < numLength; j++){
                if(i < j && nums[i] < nums[j]){
                    diff = nums[j] - nums[i];
                    if( max < diff){
                        max = diff;
                    }
                }
                else i = j;
            }
        }

        if(max > 0)
            return max;
        else return -1;
    }

    public static int maxDiff(int num) {
        // Eg - 514
        // get the length of the integer
        // get the lowest number(x) -> 
        // get the highest number(y) -> 
        // replace all x with 9 = a and y with 1 = b
        // then b - a = result
        
        String num1 = String.valueOf(num);
        char ch = num1.charAt(0);
        int min = Integer.parseInt(String.valueOf(ch));
        int max = Integer.parseInt(String.valueOf(ch));
        //System.out.println(num1.length());

        // Getting Min and Max
        for(int i = 0; i < num1.length(); i++){
            if(min > Integer.parseInt(String.valueOf(num1.charAt(i)))){
                min =Integer.parseInt(String.valueOf(num1.charAt(i)));
            }
            if(max < Integer.parseInt(String.valueOf(num1.charAt(i)))){
                max = Integer.parseInt(String.valueOf(num1.charAt(i)));
            }
        }
        
        // Getting the highest number
        char minDigit = (char)(min + '0');
        int a = Integer.parseInt(String.valueOf(num1.replace(minDigit, '9')));      ;
        System.out.println("greatest number = " + a);
        
        // Getting the lowest number
        char maxDigit = (char)(max + '0');
        int b = Integer.parseInt(String.valueOf(num1.replace(maxDigit, '1')));
        System.out.println("smallest number = " + b);
    
        return a - b;
    }
}