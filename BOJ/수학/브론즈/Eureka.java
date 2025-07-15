import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int[] triangleNumbers;

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 삼각수는 n(n+1)/2 로 구한다.
        triangleNumbers = new int[45]; // 대략 Tn <= 1000 인 n은 44까지 가능
        for (int i = 1; i <= 44; i++) {
            triangleNumbers[i] = i * (i + 1) / 2;
        }

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int K = Integer.parseInt(br.readLine());
            boolean found = false;

            // 3중 for문으로 세 개의 삼각수 조합 탐색
            for (int i = 1; i <= 44; i++) {
                for (int j = 1; j <= 44; j++) {
                    for (int k = 1; k <= 44; k++) {
                        int sum = triangleNumbers[i] + triangleNumbers[j] + triangleNumbers[k];
                        if (sum == K) {
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (found) break;
            }

            if (found) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb);
    }
}
