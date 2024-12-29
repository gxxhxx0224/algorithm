import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        int[] results = new int[1001]; // N은 최대 1000까지

        // 모든 N에 대한 결과 미리 계산
        for (int n = 1; n <= 1000; n++) {
            int sum = 0;
            for (int b = 2; b <= n; b++) { // b가 n 이상이면 항상 나머지가 0이므로 반복 필요 없음
                int temp = n;
                int count = 0;
                while (temp % b == 0) {
                    count++;
                    temp /= b;
                }
                sum += count;
            }
            results[n] = sum;
        }

        // 테스트 케이스 처리
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(results[N]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
