import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            sum += Math.pow(digit, 5);
        }

        System.out.println(sum);
    }
}
