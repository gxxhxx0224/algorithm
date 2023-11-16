import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1961 {
    static int n, arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int j = 0; j < n; j++)
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }

            sb.append('#').append(tc).append('\n');

            for(int i=0;i<n;i++)
                sb.append(rotate(i));
        }
        System.out.print(sb);
    }

    public static String rotate(int Idx) {
        String ans = "";

        for (int i = n - 1; i >= 0; i--)
            ans += arr[i][Idx];
        ans += " ";

        for (int j = n - 1; j >= 0; j--)
            ans += arr[n - 1 - Idx][j];
        ans += " ";

        for (int i = 0; i < n; i++)
            ans += arr[i][n - 1 - Idx];
        ans += "\n";

        return ans;
    }
}
