import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n12 = sc.nextInt();

        int estimatedTotal = (int) ((n1 + 1L) * (n2 + 1) / (n12 + 1) - 1);
        System.out.println(estimatedTotal);
    }
}
