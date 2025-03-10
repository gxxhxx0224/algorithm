import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄: 책 10권의 총 가격
        int totalPrice = sc.nextInt();

        // 9권의 가격 합산
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += sc.nextInt();
        }

        // 남은 1권의 가격 계산 및 출력
        System.out.println(totalPrice - sum);

        sc.close();
    }
}
