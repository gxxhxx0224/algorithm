import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Operator {
    static int min, max;
    static int n, arr[], operation[];
    static boolean check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); //수의 개수
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        operation = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++)
            operation[i] = Integer.parseInt(st.nextToken());

        check = new boolean[n];
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        dfs(1, arr[0]);

        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int idx, int num) {
        if (idx == n) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operation[i] > 0) {

                operation[i]--;

                switch (i) {
                    case 0:
                        dfs(idx + 1, num + arr[idx]);
                        break;
                    case 1:
                        dfs(idx + 1, num - arr[idx]);
                        break;
                    case 2:
                        dfs(idx + 1, num * arr[idx]);
                        break;
                    case 3:
                        dfs(idx + 1, num / arr[idx]);
                        break;
                }
                operation[i]++;
            }
        }
    }
}
