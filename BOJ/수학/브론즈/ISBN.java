import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 고정된 첫 10자리
        String isbn = "9780921418";

        // 입력받은 마지막 3자리 추가
        for (int i = 0; i < 3; i++) {
            isbn += sc.nextLine();  // 줄 단위 입력
        }

        int sum = 0;
        for (int i = 0; i < 13; i++) {
            int digit = isbn.charAt(i) - '0';  // 문자 -> 숫자
            if ((i + 1) % 2 == 1) {
                sum += digit;
            } else {
                sum += digit * 3;
            }
        }

        System.out.println("The 1-3-sum is " + sum);
    }
}
