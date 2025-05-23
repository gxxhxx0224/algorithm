import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int leftGap = b - a;
        int rightGap = c - b;

        int maxMoves = Math.max(leftGap, rightGap) - 1;

        System.out.println(maxMoves);
    }
}
