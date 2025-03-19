import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt(); // 막내 나이
        int M = scanner.nextInt(); // 둘째 나이
        scanner.close();
        
        int R = 2 * M - Y; // 첫째 나이 (등차수열의 규칙 적용)

        System.out.println(R);
    }
}
