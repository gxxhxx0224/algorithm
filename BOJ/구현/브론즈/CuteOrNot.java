import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 설문조사 인원 수
        int cuteCount = 0; // 귀엽다 의견 수

        for (int i = 0; i < n; i++) {
            int opinion = scanner.nextInt();
            if (opinion == 1) {
                cuteCount++;
            }
        }

        if (cuteCount > n / 2) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }

        scanner.close();
    }
}
