import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Bottom-Up
public class Sum123 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트케이스의 수

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            int dp[] = new int[n + 1 + 3]; // 인덱스에 해당하는 수를 합으로 나타내는 방법의 수(3까지는 더하려고)

            dp[1] = 1; //1을 나타내는 방법은 1
            dp[2] = 2; //2를 나타내는 방법은 1+1,2
            dp[3] = 4; //3을 나타애는 방법은 1+1+1,1+2,2+1,3

            if (n >= 4)
                for (int i = 4; i <= n; i++)
                    dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];


            System.out.println(dp[n]);
        }
    }
}
