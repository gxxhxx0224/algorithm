import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // N은 최대 2^30이므로 long 사용

        if (N > 0 && (N & (N - 1)) == 0) {
            System.out.println(1); // 2의 제곱수일 때
        } else {
            System.out.println(0); // 아닐 때
        }
    }
}
