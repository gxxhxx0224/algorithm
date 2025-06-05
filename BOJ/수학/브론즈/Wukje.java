import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 욱의 욱제력
        int B = sc.nextInt(); // 제의 욱제력

        // M = (B - A) / 400.0
        double M = (B - A) / 400.0;

        // 승률 = 1 / (1 + 10^M)
        double winRate = 1 / (1 + Math.pow(10, M));

        System.out.println(winRate);
    }
}
