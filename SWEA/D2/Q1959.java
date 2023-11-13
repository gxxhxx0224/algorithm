import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1959 {
    static int n, m;
    static int A[], B[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            A = new int[n];
            B = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                A[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++)
                B[i] = Integer.parseInt(st.nextToken());

            int max=0;

            if(n<m)
                max=compare(n,m,A,B);
            else
                max=compare(m,n,B,A);

            sb.append('#').append(tc).append(' ').append(max).append('\n');
        }
        System.out.print(sb);
    }

    public static int compare(int N, int M, int a[], int b[]) {
        int index = 0;
        int max = 0, ans;

        while (index <= M - N) {
            ans = 0;

            for (int i = 0; i < N; i++)
                ans += a[i] * b[i + index];
            max = Math.max(max, ans);
            index++;
        }
        return max;
    }
}
