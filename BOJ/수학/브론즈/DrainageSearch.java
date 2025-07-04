import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (true) {

            int num = sc.nextInt();

            if (num == 0) {

                break;

            }

            if (num % n == 0) {

                System.out.printf("%d is a multiple of %d.%n", num, n);

            } else {

                System.out.printf("%d is NOT a multiple of %d.%n", num, n);

            }

        }

    }

}

