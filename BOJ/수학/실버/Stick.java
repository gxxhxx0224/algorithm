import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // X 입력
        int X = scanner.nextInt();
        scanner.close();

        int stick = 64; // 초기 막대 길이
        int count = 0;  // 필요한 막대 개수의 합

        // X가 0이 될 때까지 반복
        while (X > 0) {
            // 가장 짧은 막대를 절반으로 나눈다.
            if (stick > X) {
                stick /= 2; // 막대를 절반으로 자른다.
            } else {
                // 막대 길이를 추가하고 남은 길이를 줄인다.
                count++;
                X -= stick;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
