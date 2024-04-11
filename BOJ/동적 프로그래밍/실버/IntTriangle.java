import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Bottom-Up
public class IntTriangle {
    static int arr[][],dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //삼각형의 크기
        arr = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1];

        for(int i=1;i<=n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count=st.countTokens();

            for(int j=1;j<=count;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[1][1]=arr[1][1];

        for(int depth=1;depth<=n;depth++){
            if(depth==1) continue;

            for(int idx=1;idx<=depth;idx++)
                dp[depth][idx] = arr[depth][idx] + Math.max(dp[depth - 1][idx - 1], dp[depth - 1][idx]);
        }
        int max=0;
        for (int i = 1; i <= n; i++)
            max = Math.max(max, dp[n][i]);
        System.out.print(max);
    }
}
