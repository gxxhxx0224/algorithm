import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Buttom Up
public class EasyStairs_BottomUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int mod=1000000000;
        long dp[][]=new long[n+1][10];

        for(int i=0;i<10;i++){
            dp[1][i]=1L;
        }

        if(n>1) {
            for (int i = 2; i <= n; i++) {
                for (int j = 0; j < 10; j++) {
                    if (j == 0) dp[i][0] = dp[i - 1][1] % mod;
                    else if (j == 9) dp[i][9] = dp[i - 1][8] % mod;
                    else dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
                }
            }
        }

        long sum=0;
        for(int i=1;i<=9;i++){
            sum=(sum+dp[n][i])%mod;
        }

        System.out.println(sum);
    }
}
