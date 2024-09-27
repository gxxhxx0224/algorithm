import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 스위치 개수
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine()); // 학생 수

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken()); // 성별
            int num = Integer.parseInt(st.nextToken()); // 받은 수

            if (sex == 1) { // 남학생: 배수 스위치 변경
                for (int j = num - 1; j < n; j += num) {
                    arr[j] = (arr[j] == 1) ? 0 : 1;
                }
            } else { // 여학생: 대칭 스위치 변경
                int from = num - 1;
                int to = num - 1;

                // 대칭 구간 확장
                while (from > 0 && to < n - 1 && arr[from - 1] == arr[to + 1]) {
                    from--;
                    to++;
                }

                // 확장된 구간의 스위치 상태 변경
                for (int j = from; j <= to; j++) {
                    arr[j] = (arr[j] == 1) ? 0 : 1;
                }
            }
        }

        // 출력 형식 맞추기
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 20 == 0) System.out.println(); // 20개씩 한 줄에 출력
        }
    }
}
