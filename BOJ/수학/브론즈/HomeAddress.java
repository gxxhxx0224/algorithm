import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("0")) break;

            int totalWidth = 0;

            for (char ch : input.toCharArray()) {
                if (ch == '1') totalWidth += 2;
                else if (ch == '0') totalWidth += 4;
                else totalWidth += 3;
            }

            // 숫자 사이 여백 + 양 끝 여백
            totalWidth += (input.length() - 1) + 2;

            System.out.println(totalWidth);
        }
    }
}
