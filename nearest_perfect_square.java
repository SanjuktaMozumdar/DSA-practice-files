import java.lang.Math;
import java.util.Scanner;
class nearest_perfect_square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        sc.close();
        if(n>0)
        {
            int a = (int)Math.sqrt((Math.round(n)));
            int prev = (int)Math.pow(a,2);
            int next = (int)Math.pow(a+1,2);
            if((int)Math.pow(a, 2) == n){
                System.out.println((int)n + " Is a perfect square number!");
            }             
            else if(n-prev > next-n){
                System.out.println("Nearest perfect square : "+ n +" + "+(next-n)+" = "+ next);
            }  
            else if(n-prev < next-n){
                System.out.println("Nearest perfect square : "+ n +" - "+(n-prev)+" = "+ prev);
            }
        }
        else
            System.out.println("Enter a valid positive integer number.");
        
    }
}