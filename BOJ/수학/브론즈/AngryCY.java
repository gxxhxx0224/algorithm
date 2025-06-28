import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();

        double maxLength = Math.sqrt(W * W + H * H);

        for (int i = 0; i < N; i++) {
            int matchLength = sc.nextInt();
            if (matchLength <= maxLength) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
