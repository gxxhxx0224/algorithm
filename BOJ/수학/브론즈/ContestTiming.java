import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 시작 시각 (11일 11시 11분)
        int start = 11 * 24 * 60 + 11 * 60 + 11; // 기준: 0일 0시0분에서 분 단위
        // 종료 시각
        int end = D * 24 * 60 + H * 60 + M;

        int diff = end - start;

        if (diff < 0) {
            System.out.println(-1);
        } else {
            System.out.println(diff);
        }
    }
}
