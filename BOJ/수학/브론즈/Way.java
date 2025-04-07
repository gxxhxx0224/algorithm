import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeconds = 0;

        for (int i = 0; i < 4; i++) {
            totalSeconds += sc.nextInt();
        }

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.println(minutes);
        System.out.println(seconds);
    }
}
