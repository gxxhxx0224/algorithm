import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();

        double euclideanArea = Math.PI * R * R;
        double taxiArea = 2.0 * R * R;

        System.out.printf("%.6f\n", euclideanArea);
        System.out.printf("%.6f\n", taxiArea);
    }
}
