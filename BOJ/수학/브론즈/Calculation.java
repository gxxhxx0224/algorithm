import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = sc.nextInt(); // 첫 번째 숫자
        while (true) {
            String op = sc.next(); // 연산자

            if (op.equals("=")) {
                System.out.println(result);
                break;
            }

            int num = sc.nextInt(); // 다음 숫자

            switch (op) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    result /= num; // 문제 조건: 소수점 버림
                    break;
            }
        }
        sc.close();
    }
}
