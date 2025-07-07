import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String line = sc.nextLine();
            String[] words = line.split(" ");
            String word1 = words[0];
            String word2 = words[1];

            System.out.print("Distances:");

            for (int j = 0; j < word1.length(); j++) {
                int x = word1.charAt(j) - 'A' + 1;
                int y = word2.charAt(j) - 'A' + 1;
                int distance;
                if (y >= x) {
                    distance = y - x;
                } else {
                    distance = (y + 26) - x;
                }
                System.out.print(" " + distance);
            }
            System.out.println();
        }
    }
}
