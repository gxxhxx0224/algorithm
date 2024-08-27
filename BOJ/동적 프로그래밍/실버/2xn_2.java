import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Bottom Up
public class 2xn_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long dp[]=new long[1001];

        dp[1]=1L;
        dp[2]=3L;

        if(n>=3) {
            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 2] * 2 + dp[i - 1])%10007;
            }
        }
        System.out.print(dp[n]);
    }
}
