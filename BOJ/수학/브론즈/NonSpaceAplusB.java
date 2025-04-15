import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 예: "37", "102"
        int result = 0;

        // 길이에 따라 A와 B를 나눈다
        if (input.length() == 2) {
            // A: 1자리, B: 1자리
            int A = Character.getNumericValue(input.charAt(0));
            int B = Character.getNumericValue(input.charAt(1));
            result = A + B;
        } else if (input.length() == 3) {
            if (input.charAt(1) == '0') {
                // A: 10, B: 나머지 1자리
                int A = Integer.parseInt(input.substring(0, 2));
                int B = Character.getNumericValue(input.charAt(2));
                result = A + B;
            } else {
                // A: 1자리, B: 10
                int A = Character.getNumericValue(input.charAt(0));
                int B = Integer.parseInt(input.substring(1, 3));
                result = A + B;
            }
        } else if (input.length() == 4) {
            // A: 10, B: 10
            int A = Integer.parseInt(input.substring(0, 2));
            int B = Integer.parseInt(input.substring(2, 4));
            result = A + B;
        }

        System.out.println(result);
    }
}
