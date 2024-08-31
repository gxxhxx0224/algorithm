import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertOperator {
    static int Min;
    static int Max;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //수 개수

        //수 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //사칙연산
        int op[] = new int[4]; // +,-,*,/
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }
        Min = Integer.MAX_VALUE;
        Max = Integer.MIN_VALUE;

        dfs(arr[0],1, op[0], op[1], op[2], op[3]);

        System.out.print(Max + "\n" + Min);
    }

    public static void dfs(int num, int idx, int sum, int min, int mul, int div) {
        if (sum == 0 && min == 0 && mul == 0 && div == 0) {
            if (num > Max) Max = num;
            if (num < Min) Min = num;
            return;
        }


        if (sum > 0) dfs(num + arr[idx], idx + 1, sum - 1, min, mul, div);
        if (min > 0) dfs(num - arr[idx], idx + 1, sum, min - 1, mul, div);
        if (mul > 0) dfs(num * arr[idx], idx + 1, sum, min, mul - 1, div);
        if (div > 0) dfs(num / arr[idx], idx + 1, sum, min, mul, div - 1);


    }
}
