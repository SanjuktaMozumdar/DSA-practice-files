import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG_JobSequence {

    class Job{
        int deadline, profit;
        Job(int deadline, int profit){
            this.deadline = deadline;
            this.profit = profit;

        }
    }






    public static void main(String[] args) {
        
    }

    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int len = deadline.length;
        Job jobs[] = new Job[len];
        int maxDeadLine = 0;
        for(int i = 0; i < len; i++){
            jobs[i] = new Job(deadline[i],profit[i]);
            maxDeadLine = Math.max(maxDeadLine, deadline[i]);
        }

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);



       // List<Integer> res[][] = new ArrayList<>(new int[] a, new int[] b);
        return res;
    
    }
}

