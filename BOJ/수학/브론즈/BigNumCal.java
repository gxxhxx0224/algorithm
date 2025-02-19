import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 수 T
        int T = sc.nextInt();

        // T개의 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            int sum = 0;
            int min = Integer.MAX_VALUE;
            
            // 7개의 자연수 입력
            for (int i = 0; i < 7; i++) {
                int num = sc.nextInt();
                
                // 짝수일 경우
                if (num % 2 == 0) {
                    sum += num;
                    min = Math.min(min, num);
                }
            }
            
            // 결과 출력
            System.out.println(sum + " " + min);
        }

        sc.close();
    }
}
