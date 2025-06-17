import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int legs = sc.nextInt();
            int chickens = sc.nextInt();

            int oneLeg = 2 * chickens - legs;
            int twoLeg = legs - chickens;

            System.out.println(oneLeg + " " + twoLeg);
        }

        sc.close();
    }
}
