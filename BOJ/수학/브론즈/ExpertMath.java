import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int[] sides = new int[3];
            sides[0] = sc.nextInt();
            sides[1] = sc.nextInt();
            sides[2] = sc.nextInt();

            Arrays.sort(sides);
            int a = sides[0];
            int b = sides[1];
            int c = sides[2];  // 가장 긴 변

            System.out.println("Scenario #" + i + ":");

            if (c * c == a * a + b * b) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            System.out.println();
        }
        sc.close();
    }
}
