import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int result;

        if (input.startsWith("0x")) {
            // 16진수 처리
            result = Integer.parseInt(input.substring(2), 16);
        } else if (input.startsWith("0") && input.length() > 1) {
            // 8진수 처리
            result = Integer.parseInt(input.substring(1), 8);
        } else {
            // 10진수 처리
            result = Integer.parseInt(input);
        }

        System.out.println(result);
    }
}
