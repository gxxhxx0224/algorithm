import java.io.*;
import java.util.*;

//29718 S3 '줄줄이 박수'
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = Integer.parseInt(br.readLine());

        //첫 슬라이드
        int sum = 0;
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < count; x++) {
                sum += arr[y][x];
            }
        }

        int max = sum;
        if (count < m) {
            for (int x = 1; x <= m - count; x++) {
                for (int y = 0; y < n; y++) {
                    sum -= arr[y][x - 1];
                    sum += arr[y][x + count - 1];
                }
                max = Math.max(max, sum);
            }
        }
        System.out.print(max);
    }
}
