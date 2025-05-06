import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 문자열 입력 받기

        String[] parts = input.split(","); // 콤마 기준으로 나누기
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part); // 문자열 -> 정수 변환 후 더하기
        }

        System.out.println(sum); // 결과 출력
        sc.close();
    }
}
