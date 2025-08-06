import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();

            // 입력 종료 조건
            if (a1 == 0 && a2 == 0 && a3 == 0) break;

            if (a2 - a1 == a3 - a2) {
                // 등차수열(AP)
                int d = a2 - a1;
                int next = a3 + d;
                System.out.println("AP " + next);
            } else {
                // 등비수열(GP)
                int r = a2 / a1;
                int next = a3 * r;
                System.out.println("GP " + next);
            }
        }

        sc.close();
    }
}
