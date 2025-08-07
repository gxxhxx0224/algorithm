import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int HH = sc.nextInt();
        int MM = sc.nextInt();
        
        // 대회 시작 시간: 9:00 AM (540분)
        int startTime = 9 * 60;
        
        // 정답 제출 시간을 분으로 변환
        int submitTime = HH * 60 + MM;
        
        // 경과 시간 계산
        int elapsedTime = submitTime - startTime;
        
        System.out.println(elapsedTime);
        
        sc.close();
    }
}
