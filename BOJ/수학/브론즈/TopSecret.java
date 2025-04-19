import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            if (line.equals("END")) break;

            StringBuilder sb = new StringBuilder(line);
            System.out.println(sb.reverse().toString());
        }
    }
}
