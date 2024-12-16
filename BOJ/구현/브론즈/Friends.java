import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt(); // 친구 수
        int M = sc.nextInt(); // 공을 받아야 하는 횟수
        int L = sc.nextInt(); // 이동할 거리

        // 각 사람의 공 받은 횟수를 기록할 배열
        int[] counts = new int[N];

        int current = 0; // 현재 공을 가진 사람의 위치 (0부터 시작)
        int throwsCount = 0; // 공을 던진 횟수

        while (true) {
            // 현재 사람이 공을 받음
            counts[current]++;

            // M번 공을 받은 사람이 나오면 종료
            if (counts[current] == M) {
                break;
            }

            // 공을 던진 횟수 증가
            throwsCount++;

            // 다음 사람 계산
            if (counts[current] % 2 == 1) { // 홀수번 받은 경우
                current = (current + L) % N;
            } else { // 짝수번 받은 경우
                current = (current - L + N) % N;
            }
        }

        // 결과 출력
        System.out.println(throwsCount);
    }
}
