import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        sc.close();

        if (A + B == C) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
    }
}
