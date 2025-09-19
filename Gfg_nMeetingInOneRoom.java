import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gfg_nMeetingInOneRoom {
   
    class MeetingSchedule{
        int start, end, pos;
        MeetingSchedule(int start, int end, int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
            
        }
    }

    public int maxMeetings(int start[], int end[]) {
        
        int totalMeeting = start.length;
        
        MeetingSchedule arr[] = new MeetingSchedule[totalMeeting]; 
        for(int i = 0; i < totalMeeting; i++){
            arr[i] = new MeetingSchedule(start[i], end[i], i+1);
        }

        Arrays.sort(arr, (a,b) -> a.end - b.end);
        List<Integer> possitions = new ArrayList<>();
        int ans = 1;
        int e = arr[0].end;
        possitions.add(arr[0].pos);
        for( int i = 0; i < totalMeeting; i++){
            if(arr[i].start > e){
                 ans += 1;
                 e = arr[i].end;
                 possitions.add(arr[i].pos);
            }
        }

        System.out.println(ans);
        return ans;
    }
     public static void main(String[] args) {
        int start[] = {0,3,1,5,5,8};
        int end[] = {5,4,2,9,7,9};
        Gfg_nMeetingInOneRoom meetingRoom = new Gfg_nMeetingInOneRoom();
        meetingRoom.maxMeetings(start, end);
    }
}
