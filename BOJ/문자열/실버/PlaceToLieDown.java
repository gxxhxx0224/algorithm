import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume the newline

        char[][] room = new char[n][n];

        for (int i = 0; i < n; i++) {
            room[i] = sc.nextLine().toCharArray();
        }

        int horizontal = 0;
        int vertical = 0;

        // Check horizontal spaces
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (room[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) {
                        horizontal++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                horizontal++;
            }
        }

        // Check vertical spaces
        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (room[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) {
                        vertical++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                vertical++;
            }
        }

        System.out.println(horizontal + " " + vertical);
    }
}
