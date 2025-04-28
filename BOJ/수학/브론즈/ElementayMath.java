import java.util.Scanner;

public class Main {

    // 최대공약수 구하는 함수 (유클리드 호제법)

    public static int gcd(int a, int b) {

        while (b != 0) {

            int temp = a % b;

            a = b;

            b = temp;

        }

        return a;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {

            int a = sc.nextInt();

            int b = sc.nextInt();

            int gcd = gcd(a, b);

            int lcm = (a * b) / gcd;

            System.out.println(lcm + " " + gcd);

        }

    }

}

