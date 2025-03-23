import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // N: 100원 동전 개수, M: 초코바 가격
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 밤고가 가진 돈 계산 (100원 동전 개수 * 100원)
        int totalMoney = N * 100;
        
        // 초코바를 살 수 있는지 판단
        if (totalMoney >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
