import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());  // 숫자의 개수

        for (int i = 0; i < N; i++) {
            String number = sc.nextLine();
            char lastDigit = number.charAt(number.length() - 1);

            if (lastDigit % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
