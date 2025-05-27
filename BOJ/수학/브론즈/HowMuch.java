import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int total = sc.nextInt(); // 자동차 기본 가격
            int n = sc.nextInt();     // 옵션 개수

            for (int i = 0; i < n; i++) {
                int q = sc.nextInt(); // 옵션 수량
                int p = sc.nextInt(); // 옵션 가격
                total += q * p;       // 옵션 가격 합산
            }

            System.out.println(total); // 최종 가격 출력
        }

        sc.close();
    }
}
