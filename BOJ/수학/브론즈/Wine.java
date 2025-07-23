import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt(); // 수집한 년수
        int K = sc.nextInt(); // 애착 정도
        int P = sc.nextInt(); // 구매중독 정도

        int total = 0;
        for (int n = 1; n <= C; n++) {
            total += K * n + P * n * n;
        }

        System.out.println(total);
    }
}
