import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();  // 더할 숫자의 개수
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();  // 하나씩 더하기
        }

        System.out.println(sum);  // 결과 출력
        scanner.close();
    }
}
