import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        // 최소 공배수를 구할 숫자를 찾기 시작
        int candidate = 1;
        while (true) {
            int count = 0;

            // 후보 숫자가 몇 개의 입력값으로 나누어지는지 확인
            for (int num : numbers) {
                if (candidate % num == 0) {
                    count++;
                }
            }

            // 적어도 3개로 나누어지는 경우 출력
            if (count >= 3) {
                System.out.println(candidate);
                break;
            }

            candidate++;
        }
    }
}
