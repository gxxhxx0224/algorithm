import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int d = sc.nextInt();
            int t = 0;

            // t^2 + t <= d 를 만족하는 최대 t 찾기
            while ((t + 1) * (t + 1) + (t + 1) <= d) {
                t++;
            }

            System.out.println(t);
        }
    }
}
