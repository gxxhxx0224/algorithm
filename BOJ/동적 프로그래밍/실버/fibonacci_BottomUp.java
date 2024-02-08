import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Bottom-Up
public class fibonacci_BottomUp {
    static Integer dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=1;tc<=T;tc++){
            int n=Integer.parseInt(br.readLine());
            dp=new Integer[n+1][2];
            dp[0][0]=1; //0일때 0이 호출되는 횟수
            dp[0][1]=0;
            if(n>=1) {
                dp[1][0] = 0;
                dp[1][1] = 1;//1일때 1이 호출되는 횟수
            }
            for(int i=2;i<=n;i++){
                dp[i][0]=dp[i-1][0]+dp[i-2][0];
                dp[i][1]=dp[i-1][1]+dp[i-2][1];
            }
            System.out.println(dp[n][0]+" "+dp[n][1]);
        }
    }
}
