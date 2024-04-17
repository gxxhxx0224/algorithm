import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//dp bottom-up
public class BinomialCoefficient_1_BottomUp {
    static int n,k,dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        dp=new int[11][11];

        for(int i=0;i<=10;i++){
            dp[i][0]=1;
            dp[i][i]=1;
        }

        for(int i=2;i<=10;i++){
            for(int j=1;j<=10;j++){
                dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
            }
        }
        System.out.println(dp[n][k]);
    }

}
