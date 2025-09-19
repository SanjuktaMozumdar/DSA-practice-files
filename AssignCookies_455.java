import java.util.Arrays;

public class AssignCookies_455 {
    public static void main(String[] args) {
        int g[] = {1,3,2};
        int s[] = {3};
        findContentChildren(g, s);
    }

    public static int findContentChildren(int[] g, int[] s) {
        
        // Sorring the g= greedy factor and s= cookie size
        Arrays.sort(g);
        Arrays.sort(s);
        
        int cookie = 0, child = 0;
        while (child < g.length && cookie < s.length) {
            if(s[cookie] >= g[child]) child++;

            cookie++;
        
        }
        System.out.println(child);
        return child;
    }
}
