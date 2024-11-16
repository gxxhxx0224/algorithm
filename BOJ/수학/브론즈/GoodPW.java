import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        BigInteger K = scanner.nextBigInteger(); // 매우 큰 정수
        int L = scanner.nextInt(); // 제한 범위
        scanner.close();
        
        // L 이하의 소수 찾기
        for (int i = 2; i < L; i++) {
            // i로 K를 나눌 수 있는지 확인
            if (K.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                // 나누어 떨어지면 BAD와 최소 인수 출력
                System.out.println("BAD " + i);
                return;
            }
        }
        
        // 모든 검사를 통과하면 GOOD 출력
        System.out.println("GOOD");
    }
}
