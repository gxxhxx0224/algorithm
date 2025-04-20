import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt(); // 사람 수
            int s = sc.nextInt(); // 주식 수

            int result = s / (n + 1); // 각자가 받을 수 있는 주식 수
            System.out.println(result);
        }

        sc.close();
    }
}
