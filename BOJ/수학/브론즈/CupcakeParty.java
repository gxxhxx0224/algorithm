import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt(); // Regular box 수
        int S = sc.nextInt(); // Small box 수

        int totalCupcakes = (R * 8) + (S * 3);
        int leftover = totalCupcakes - 28;

        System.out.println(leftover);
    }
}
