import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Top-Down
public class fibonacci_TopDown {
    static Integer dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 수

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            dp = new Integer[n + 1][2];
            dp[0][0] = 1; //0일때 0이 출력되는 횟수
            dp[0][1] = 0;

            if(n>=1) {
                dp[1][0] = 0;
                dp[1][1] = 1; //1일때 1이 출력되는 횟수
            }
            recur(n, 0);
            recur(n, 1);

            System.out.println(dp[n][0]+" "+dp[n][1]);
        }
    }

    public static int recur(int n, int idx) {
        if (dp[n][idx] == null) {
            dp[n][idx] = recur(n - 1, idx) + recur(n - 2, idx);
        }
        return dp[n][idx];
    }
}
