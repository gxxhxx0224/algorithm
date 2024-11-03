import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 곡 수
        int L = Integer.parseInt(st.nextToken()); // 각 곡의 길이
        int D = Integer.parseInt(st.nextToken()); // 전화벨 간격

        // 전체 앨범 재생 시간 (곡 + 조용한 구간)
        int albumEnd = (L + 5) * (N - 1) + L;
        
        // 전화벨이 울리는 시간 중 노래가 아닌 시간 찾기
        for (int time = 0; time <= albumEnd; time += D) {
            // 노래가 재생되는 시간인지 확인
            boolean isRingingDuringSong = false;
            for (int i = 0; i < N; i++) {
                int start = i * (L + 5); // 각 곡이 시작하는 시간
                int end = start + L; // 각 곡이 끝나는 시간
                if (time >= start && time < end) {
                    isRingingDuringSong = true;
                    break;
                }
            }
            if (!isRingingDuringSong) { // 조용한 구간에서 전화벨이 울리는 경우
                System.out.println(time);
                return;
            }
        }

        // 모든 곡을 다 들은 이후에 전화벨이 울리는 경우
        System.out.println(((albumEnd / D) + 1) * D);
    }
}
