import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Bottom-Up
public class RGB_distance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int house[][] = new int[n + 1][3]; //
        int dp[][] = new int[n + 1][3];
        dp[0][0]=dp[0][1]=dp[0][2]=0;

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            house[i][0] = Integer.parseInt(st.nextToken()); //빨강으로 칠하는 비용
            house[i][1] = Integer.parseInt(st.nextToken()); //초록
            house[i][2] = Integer.parseInt(st.nextToken()); //파랑
        }

        for (int i = 1; i <= n; i++) {
            dp[i][0] = house[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]); //빨강집을 골랐을때의 최소이익
            dp[i][1] = house[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = house[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }
        System.out.print(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));
    }
}
