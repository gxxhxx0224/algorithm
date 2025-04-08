import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄 입력: 통장 A, B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // 둘째 줄 입력: 치킨 한 마리 가격 C
        int C = scanner.nextInt();

        // 욱제가 치킨 두 마리를 살 수 있는지 확인
        int totalBalance = A + B;
        int totalChickenPrice = C * 2;

        // 살 수 있다면, 치킨값을 제외한 금액 출력
        // 살 수 없다면, 잔고 총합 그대로 출력
        if (totalBalance >= totalChickenPrice) {
            System.out.println(totalBalance - totalChickenPrice);
        } else {
            System.out.println(totalBalance);
        }
    }
}
