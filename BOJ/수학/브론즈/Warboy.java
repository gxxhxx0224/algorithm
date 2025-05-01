import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 경쟁사 가격
        int B = sc.nextInt(); // 경쟁사 성능
        int C = sc.nextInt(); // WARBOY 가격

        int warboyPerformance = 3 * (B / A) * C;
        System.out.println(warboyPerformance);
    }
}
