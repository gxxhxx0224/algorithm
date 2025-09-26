import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 헬멧 개수
        int M = sc.nextInt(); // 조끼 개수

        long maxHelmet = 0;
        for (int i = 0; i < N; i++) {
            long h = sc.nextLong();
            maxHelmet = Math.max(maxHelmet, h);
        }

        long maxVest = 0;
        for (int i = 0; i < M; i++) {
            long a = sc.nextLong();
            maxVest = Math.max(maxVest, a);
        }

        System.out.println(maxHelmet + maxVest);
    }
}
