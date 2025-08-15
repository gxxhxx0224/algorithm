import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] x = new int[3];
        for (int i = 0; i < 3; i++) x[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(x); // x[0] <= x[1] <= x[2]

        int d1 = x[1] - x[0];
        int d2 = x[2] - x[1];

        int ans;
        if (d1 == d2) {
            ans = x[2] + d1;          // 혹은 x[0] - d1 도 OK (스페셜 저지)
        } else if (d1 < d2) {
            ans = x[1] + d1;          // 큰 간격(뒤쪽) 메꾸기
        } else {
            ans = x[0] + d2;          // 큰 간격(앞쪽) 메꾸기
        }

        System.out.println(ans);
    }
}
