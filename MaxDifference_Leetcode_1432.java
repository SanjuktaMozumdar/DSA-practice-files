public class MaxDifference_Leetcode_1432 {
    public static void main(String[] args) {
        System.out.println(maxDiff(1101057));
    }
    public static int maxDiff(int num) {
                
        String num1 = String.valueOf(num);
        char ch = num1.charAt(0);
        int a = 0, b = 0;        
        char toMax = ' ', toMin = ' ';
        String max= "", min = "";
        //System.out.println(num);

        //Checking for largest number
        if(toMax == ' ' && ch!= '9'){
            toMax = ch;
            max = num1.replace(toMax, '9');
        }
        else{          
            for (int i = 1; i < num1.length(); i++) {
                if(num1.charAt(i) != '9'){
                    toMax = num1.charAt(i);
                    break;
                }
            }
            max = num1.replace(toMax, '9');
        }

        //Checking for smallest number
        if(toMin == ' ' && ch != '1'){
            toMin = ch;
            min = num1.replace(toMin, '1');
        }
        else{

            for (int i = 1; i < num1.length(); i++) {
                if(num1.charAt(i) != '0'){
                    char temp = num1.charAt(i);
                    if(ch == '1' && temp != '1'){
                        toMin = temp;
                        break;
                    }
                }
            }
            min = num1.replace(toMin, '0');
            // System.out.println(min);
        }
        
        // Returning the difference
        a = Integer.parseInt(String.valueOf(max));
        b = Integer.parseInt(String.valueOf(min));
        
        if( b == 0) b = num;


        //System.out.println("Max, a = " + a + ", Min, b = " + b + " = " + (a - b));
        return a - b;
    }
}
