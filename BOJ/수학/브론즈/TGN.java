import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 테스트 케이스 개수

        for (int i = 0; i < N; i++) {
            int r = sc.nextInt();  // 광고를 하지 않았을 때 수익
            int e = sc.nextInt();  // 광고를 했을 때 수익
            int c = sc.nextInt();  // 광고 비용

            int profit = e - c;

            if (profit > r) {
                System.out.println("advertise");
            } else if (profit == r) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }

        sc.close();
    }
}
