import java.io.*;
import java.util.*;

public class Main {
    static int n, arr[], num[];
    static int max;
    static boolean check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        num = new int[n + 1];
        arr = new int[n + 1];
        check = new boolean[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++)
            num[i] = Integer.parseInt(st.nextToken());

        max = Integer.MIN_VALUE;
        dfs(1);
        System.out.print(max);
    }

    public static void dfs(int depth) {
        if (depth == n + 1) {
            int sum=0;
            for(int i=1;i<=n-1;i++){
                sum+=Math.abs(arr[i]-arr[i+1]);
            }
            max=Math.max(max,sum);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!check[i]) {
                check[i] = true;
                arr[depth]=num[i];
                dfs(depth+1);
                check[i] = false;
            }
        }
    }
}

