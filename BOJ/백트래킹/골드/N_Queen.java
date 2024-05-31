import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_Queen {
    static int n, count;
    static boolean w[], up[], down[];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        w = new boolean[n];
        up = new boolean[2 * n - 1];
        down = new boolean[2 * n - 1];

        count = 0;
        dfs(0);

        System.out.print(count);
    }

    public static void dfs(int depth) {
        if (depth == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!w[i] && !up[i + depth] && !down[i - depth + n - 1]) {
                w[i] = true;
                up[i + depth] = true;
                down[i - depth + n - 1] = true;
                dfs(depth + 1);

                w[i] = false;
                up[i + depth] = false;
                down[i - depth + n - 1] = false;
            }
        }

    }
}
