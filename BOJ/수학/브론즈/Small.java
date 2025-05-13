import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count = 0;

            for (int x = 1; x <= a; x++) {
                for (int y = 1; y <= b; y++) {
                    for (int z = 1; z <= c; z++) {
                        int r1 = x % y;
                        int r2 = y % z;
                        int r3 = z % x;
                        if (r1 == r2 && r2 == r3) {
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
