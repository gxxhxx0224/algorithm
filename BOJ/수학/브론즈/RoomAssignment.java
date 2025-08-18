import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 학생 수
        int K = Integer.parseInt(st.nextToken()); // 방 최대 인원

        // 성별(0/1) × 학년(1~6) → [2][7] 배열 (학년 인덱스 1~6 사용)
        int[][] students = new int[2][7];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken()); // 성별
            int Y = Integer.parseInt(st.nextToken()); // 학년
            students[S][Y]++;
        }

        int rooms = 0;

        // 각 성별, 학년 그룹별로 방 수 계산
        for (int s = 0; s <= 1; s++) {
            for (int y = 1; y <= 6; y++) {
                if (students[s][y] > 0) {
                    rooms += (students[s][y] + K - 1) / K; // 올림 나눗셈
                }
            }
        }

        System.out.println(rooms);
    }
}
