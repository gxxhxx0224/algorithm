import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][3]; // 참가자들의 선택 숫자 저장
        int[] scores = new int[N];   // 점수 저장

        // 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 3번 게임 각각에 대해 검사
        for (int col = 0; col < 3; col++) {
            Map<Integer, Integer> freq = new HashMap<>();
            // 빈도 세기
            for (int i = 0; i < N; i++) {
                freq.put(arr[i][col], freq.getOrDefault(arr[i][col], 0) + 1);
            }
            // 점수 계산
            for (int i = 0; i < N; i++) {
                if (freq.get(arr[i][col]) == 1) {
                    scores[i] += arr[i][col];
                }
            }
        }

        // 출력
        for (int score : scores) {
            System.out.println(score);
        }
    }
}
