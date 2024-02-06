import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Bottom-Up
public class make1_BottomUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine()); //정수 x
        int dp[] = new int[x + 1]; //연산횟수
        dp[0]=dp[1]=0;

        for(int i=2;i<=x;i++){
            if(i%6==0)
                dp[i] = Math.min(dp[i / 3], Math.min(dp[i / 2], dp[i - 1])) + 1;
            else if(i%3==0)
                dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
            else if(i%2==0)
                dp[i] = Math.min(dp[i / 2], dp[i - 1]) + 1;
            else
                dp[i] = dp[i - 1] + 1;
        }
        System.out.println(dp[x]);
    }
}
