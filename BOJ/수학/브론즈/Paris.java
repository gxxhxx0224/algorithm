import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt(); // 기차 속도
        int T = sc.nextInt(); // 파리 속도
        int D = sc.nextInt(); // 거리

        int F = T * D / (2 * S); // 파리 이동거리 계산

        System.out.println(F);
    }
}
