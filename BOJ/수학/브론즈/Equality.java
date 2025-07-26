import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();  // 예: "1 + 2 = 3"
        String[] parts = input.split(" ");  // ["1", "+", "2", "=", "3"]

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        int c = Integer.parseInt(parts[4]);

        if (a + b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
