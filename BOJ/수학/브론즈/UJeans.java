import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // 입력된 수를 문자열로 받음
        scanner.close();

        boolean isEugeneNumber = false;

        for (int i = 1; i < input.length(); i++) { // 문자열을 나눌 위치를 찾음
            String leftPart = input.substring(0, i);
            String rightPart = input.substring(i);

            long leftProduct = multiplyDigits(leftPart);
            long rightProduct = multiplyDigits(rightPart);

            if (leftProduct == rightProduct) {
                isEugeneNumber = true;
                break;
            }
        }

        System.out.println(isEugeneNumber ? "YES" : "NO");
    }

    // 각 자리수의 곱을 계산하는 메서드
    private static long multiplyDigits(String part) {
        long product = 1;
        for (char c : part.toCharArray()) {
            product *= (c - '0'); // 문자 '0'을 빼서 숫자로 변환
        }
        return product;
    }
}
