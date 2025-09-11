import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt(); // small treats
        int M = sc.nextInt(); // medium treats
        int L = sc.nextInt(); // large treats

        int score = S * 1 + M * 2 + L * 3;

        if (score >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
