/*Read different types of data from standard input, process them as shown 
in output format and print the answer to standard output.

Input format:
First line contains integer N.
Second line contains string S.

Output format:
First line should contain N x 2.
Second line should contain the same string S. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
class standatd_In_Out {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());  // Reading input from STDIN
        String name = br.readLine();                // Reading input from STDIN
        System.out.println(number * 2);  // Writing output to STDOUT
        System.out.println(name);    // Writing output to STDOUT
    }
}

