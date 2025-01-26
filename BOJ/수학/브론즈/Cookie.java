import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // 과자 한 개의 가격
        int N = sc.nextInt(); // 사려고 하는 과자의 개수
        int M = sc.nextInt(); // 현재 동수가 가진 돈

        // 필요한 총 금액 계산
        int totalCost = K * N;
        
        // 모자란 돈 계산
        int shortage = totalCost - M;
        
        // 모자란 돈이 0보다 작으면 0 출력, 그렇지 않으면 모자란 금액 출력
        if (shortage < 0) {
            System.out.println(0);
        } else {
            System.out.println(shortage);
        }

        sc.close();
    }
}
