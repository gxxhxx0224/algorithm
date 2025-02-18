import java.util.Scanner;

public class Main {
    // 최대공약수(GCD) 구하는 메서드
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        // 톰이 가진 치즈의 무게 계산 (1 - A/B)
        int P = B - A;
        int Q = B;

        // 기약분수로 만들기 위해 최대공약수로 나누기
        int gcd = gcd(P, Q);
        P /= gcd;
        Q /= gcd;

        // 결과 출력
        System.out.println(P + " " + Q);
    }
}
