import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class MeetingRoom_Rambda{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int time[][]=new int[n][2];
        
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken()); //시작시간
            time[i][1] = Integer.parseInt(st.nextToken()); //종료시간
        }

        Arrays.sort(time,((o1, o2) -> {
            if(o1[1]==o2[1])
                return o1[0]-o2[0];
            else
                return o1[1] - o2[1];
        }));

        int end=0; //종료 시간
        int count=0;

        for(int i=0;i<n;i++){
            if(end<=time[i][0]){
                end=time[i][1];
                count++;
            }
        }
        System.out.print(count);
    }
}
