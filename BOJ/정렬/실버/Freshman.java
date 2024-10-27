import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine()); //테케 수
        StringBuilder sb = new StringBuilder();

        for(int tc=1;tc<=t;tc++){
            int n=Integer.parseInt(br.readLine()); //지원자 수
            int arr[][]=new int[n][2];

            for(int i=0;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0]=Integer.parseInt(st.nextToken()); //서류심사 성적 순위
                arr[i][1]=Integer.parseInt(st.nextToken()); //면접성적 성적 순위
            }
            Arrays.sort(arr,(o1,o2)->{
                return o1[0]-o2[0];
            });

            int count=1;
            int minRank=arr[0][1];
            for(int i=0;i<n;i++){
                if(minRank>arr[i][1]){
                    count++;
                    minRank=arr[i][1];
                }
            }
            sb.append(count+"\n");
        }
        System.out.print(sb);
    }
}
