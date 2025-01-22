import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // 윗부분 출력
        for (int i = 1; i <= N; i++) {
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 가운데 공백
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }
            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아랫부분 출력
        for (int i = N - 1; i >= 1; i--) {
            // 왼쪽 별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 가운데 공백
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }
            // 오른쪽 별
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
