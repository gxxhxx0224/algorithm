import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 날짜의 일의 자리 숫자 입력
        int day = sc.nextInt();
        
        // 자동차 번호의 일의 자리 숫자 입력
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() == day) {
                count++;
            }
        }
        
        // 위반 차량 수 출력
        System.out.println(count);
        
        sc.close();
    }
}
