import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정수 입력 받기
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        // 수로 계산
        int numericResult = A + B - C;
        
        // 문자열로 계산
        String stringConcat = String.valueOf(A) + String.valueOf(B);
        int stringResult = Integer.parseInt(stringConcat) - C;
        
        // 결과 출력
        System.out.println(numericResult);
        System.out.println(stringResult);
        
        sc.close();
    }
}
