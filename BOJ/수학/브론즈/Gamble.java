import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long totalLostMoney = 0;

        while (true) {
            int bet = scanner.nextInt();
            if (bet == -1) break;
            totalLostMoney += bet;
        }

        System.out.println(totalLostMoney);
    }
}
