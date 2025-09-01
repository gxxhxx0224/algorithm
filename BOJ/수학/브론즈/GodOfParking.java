import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // 상점 개수
            StringTokenizer st = new StringTokenizer(br.readLine());

            int min = 100, max = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                min = Math.min(min, x);
                max = Math.max(max, x);
            }

            sb.append((max - min) * 2).append("\n");
        }
        System.out.print(sb);
    }
}
