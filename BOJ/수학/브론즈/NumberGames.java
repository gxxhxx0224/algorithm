import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            int n0 = sc.nextInt();
            if (n0 == 0) {
                break;
            }

            int n1 = 3 * n0;
            boolean isEven = (n1 % 2 == 0);
            int n2;
            if (isEven) {
                n2 = n1 / 2;
            } else {
                n2 = (n1 + 1) / 2;
            }
            int n3 = 3 * n2;
            int n4 = n3 / 9;

            System.out.printf("%d. %s %d%n", caseNumber, isEven ? "even" : "odd", n4);

            caseNumber++;
        }
    }
}
