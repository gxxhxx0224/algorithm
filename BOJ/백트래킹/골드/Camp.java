import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Camp {
    static int n, l, r, x, arr[], ans;
    static boolean check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //문제의 수
        l = Integer.parseInt(st.nextToken()); // <= 합
        r = Integer.parseInt(st.nextToken()); // >= 합
        x = Integer.parseInt(st.nextToken()); // <= max-min
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        check = new boolean[n];
        dfs(0, 0, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.print(ans);
    }

    public static void dfs(int idx, int cnt, int sum, int min, int max) {
        if (cnt >= 2) {
            if (sum >= l && sum <= r && max - min >= x) {
                ans++;
            }
        }

        for (int i = idx; i < n; i++) {
            if (!check[i]) {
                check[i] = true;
                dfs(i, cnt + 1, sum + arr[i], Math.min(min, arr[i]), Math.max(max, arr[i]));
                check[i] = false;
            }
        }
    }
}
