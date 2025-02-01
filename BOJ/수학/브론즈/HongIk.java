import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력: 특정 년도
        int year = sc.nextInt();
        
        // 개교 년도(1946년)을 빼서 주년 계산
        int anniversary = year - 1946;
        
        // 결과 출력
        System.out.println(anniversary);
        
        sc.close();
    }
}
