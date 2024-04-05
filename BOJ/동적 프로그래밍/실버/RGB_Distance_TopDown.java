import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Top-Down
public class RGB_Distance_TopDown {
    static int house[][];
    static Integer dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //집의 수
        house = new int[n + 1][3];
        dp = new Integer[n + 1][3];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            house[i][0] = Integer.parseInt(st.nextToken()); //빨강 비용
            house[i][1] = Integer.parseInt(st.nextToken()); //초록 비용
            house[i][2] = Integer.parseInt(st.nextToken()); //파랑 비용
        }

        dp[0][0] = dp[0][1] = dp[0][2] = 0;

        recur(n, 0); //빨간집부터 칠하며 시작하는 경우
        recur(n, 1); //초록집부터 칠하며 시작하는 경우
        recur(n, 2); //파란집부터 칠하며 시작하는 경우

        System.out.print(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));
    }

    public static int recur(int n, int color) {
        if (dp[n][color] == null) { //칠해져 있지 않으면
            if (color == 0) { //빨간집을 칠해야 하는 경우
                dp[n][0] = Math.min(recur(n - 1, 1), recur(n - 1, 2)) + house[n][0];
            }
            if (color == 1) { //초록집을 칠해야 하는 경우
                dp[n][1] = Math.min(recur(n - 1, 0), recur(n - 1, 2)) + house[n][1];
            }
            if (color == 2) { //빨간집을 칠해야 하는 경우
                dp[n][2] = Math.min(recur(n - 1, 0), recur(n - 1, 1)) + house[n][2];
            }
        }
        return dp[n][color];
    }
}
