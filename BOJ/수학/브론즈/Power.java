import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine().trim());
            int answer = (int) Math.floor(Math.sqrt(n)); // 열려 있는 방 = n 이하의 완전제곱수 개수
            sb.append(answer).append('\n');
        }

        System.out.print(sb.toString());
    }
}
