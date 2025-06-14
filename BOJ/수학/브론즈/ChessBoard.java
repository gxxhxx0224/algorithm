import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int maxPieces = 0;
        for (int i = 0; i <= N; i++) {
            int verticalCuts = i;
            int horizontalCuts = N - i;
            int pieces = (verticalCuts + 1) * (horizontalCuts + 1);
            if (pieces > maxPieces) {
                maxPieces = pieces;
            }
        }

        System.out.println(maxPieces);
    }
}
