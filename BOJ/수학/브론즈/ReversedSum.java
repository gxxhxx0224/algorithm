import java.util.Scanner;

public class Main {
    // 숫자를 뒤집는 함수 Rev
    public static int reverse(int num) {
        StringBuilder reversed = new StringBuilder(String.valueOf(num));
        return Integer.parseInt(reversed.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 숫자 입력 받기
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Rev 함수 적용 및 결과 계산
        int reversedX = reverse(X);
        int reversedY = reverse(Y);
        int sum = reversedX + reversedY;
        int result = reverse(sum);

        // 결과 출력
        System.out.println(result);

        scanner.close();
    }
}
