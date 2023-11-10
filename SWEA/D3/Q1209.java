import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine()); //테스트케이스 넘버
            int arr[][] = new int[100][100];

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int j = 0; j < 100; j++)
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }

            int sum_up = 0, sum_down = 0;
            int max = 0;

            for (int i = 0; i < 100; i++) {
                int sum_row = 0, sum_col = 0;

                for (int j = 0; j < 100; j++) {
                    sum_row += arr[i][j];
                    sum_col += arr[j][i];

                    if(i-j==0)
                        sum_down+=arr[i][j];
                    if(i+j==99)
                        sum_up+=arr[i][j];
                }
                max = Math.max(max,Math.max(sum_row, sum_col));
            }
            max=Math.max(max,Math.max(sum_down,sum_up));

            sb.append('#').append(n).append(' ').append(max).append('\n');
        }
        System.out.print(sb);
    }
}
