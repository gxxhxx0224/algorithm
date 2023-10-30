import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        //10개의 테스트 케이스
        for(int t=0;t<10;t++){
            int n=Integer.parseInt(br.readLine()); //건물의 개수
            int building[] = new int[n]; //각 건물의 층 수
            StringTokenizer st =new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) building[i]=Integer.parseInt(st.nextToken());

            int ans=0; //조망권이 확보된 세대

            for(int i=2;i<n-2;i++){
                int max = Math.max(building[i - 2], Math.max(building[i - 1], Math.max(building[i + 1], building[i + 2])));

                if(building[i]>max) { //조망권이 확보될 경우
                    ans+=building[i]-max;
                }
            }
            sb.append("#" + (t + 1) + " " + ans).append('\n');

        }br.close();
        System.out.print(sb);
    }
}
