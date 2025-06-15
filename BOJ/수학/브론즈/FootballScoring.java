import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visitingScore = calculateScore(sc);
        int homeScore = calculateScore(sc);

        System.out.println(visitingScore + " " + homeScore);
    }

    private static int calculateScore(Scanner sc) {
        int T = sc.nextInt(); // Touchdowns
        int F = sc.nextInt(); // Field goals
        int S = sc.nextInt(); // Safeties
        int P = sc.nextInt(); // Points after touchdown (1 point)
        int C = sc.nextInt(); // Two-point conversions

        return T * 6 + F * 3 + S * 2 + P * 1 + C * 2;
    }
}
