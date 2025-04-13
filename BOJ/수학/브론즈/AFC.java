import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int diff = sc.nextInt();

        int a = (sum + diff) / 2;
        int b = (sum - diff) / 2;

        if ((sum + diff) % 2 != 0 || (sum - diff) % 2 != 0 || a < 0 || b < 0) {
            System.out.println("-1");
        } else {
            System.out.println(Math.max(a, b) + " " + Math.min(a, b));
        }
    }
}
