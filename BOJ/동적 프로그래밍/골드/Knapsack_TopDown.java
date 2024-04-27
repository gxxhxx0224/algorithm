import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Top Down
public class Knapsack_TopDown {
    static int w[], v[];
    static Integer dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //물품의 수
        int k = Integer.parseInt(st.nextToken()); //버틸수 있는 무게
        w = new int[n + 1];
        v = new int[n + 1];
        dp = new Integer[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            dp[i][0] = 0;
        }

        //재귀함수의 return 0; 과 같다.
        for (int i = 0; i <= k; i++)
            dp[0][i] = 0;

        recur(n, k);

        System.out.print(dp[n][k]);
    }

    public static int recur(int n, int k) {
        if (dp[n][k] == null) {
            if (w[n] > k) dp[n][k] = recur(n - 1, k);
            else dp[n][k] = Math.max(recur(n - 1, k), recur(n - 1, k - w[n]) + v[n]);
        }
        return dp[n][k];
    }
}
