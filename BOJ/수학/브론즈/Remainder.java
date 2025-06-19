import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();  // 정수 X 입력 받기
        System.out.println(X % 21); // 21로 나눈 나머지 출력
    }
}
