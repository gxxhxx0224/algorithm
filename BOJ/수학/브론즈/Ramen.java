import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 라면 끓이는 횟수

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt(); // 라면 계수
            int B = scanner.nextInt(); // 기본 물의 양
            int X = scanner.nextInt(); // 끓일 라면 수

            int W = A * (X - 1) + B; // 공식에 따라 물의 양 계산
            System.out.println(W); // 결과 출력
        }

        scanner.close();
    }
}
