import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MeetingRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //회의의 수
        int time[][]=new int[n][2]; //[][0]:시작시간, [][1]:종료시간
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken()); //시작시간
            time[i][1] = Integer.parseInt(st.nextToken()); //종료시간
        }br.close();

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){ //종료시간이 같으면
                    return o1[0] - o2[0]; //시간시간이 빠른순 정렬
                }
                else return o1[1] - o2[1]; //아니면 종료시간이 빠른 순 정렬
            }
        });

        int count=0;
        int endTime=0; //종료시간
        for(int i=0;i<n;i++){
            if(endTime<=time[i][0]){ //이전 종료시간<=다음 시작시간인 경우 갱신
                endTime = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }

}
