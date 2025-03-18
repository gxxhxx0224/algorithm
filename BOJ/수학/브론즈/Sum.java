import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine()); // 숫자의 개수
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;

            for (int i = 0; i < N; i++) {
                sum += Integer.parseInt(st.nextToken()); // 숫자를 더함
            }

            sb.append(sum).append("\n"); // 결과 저장
        }

        System.out.print(sb.toString()); // 최종 출력
    }
}
