import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());

        // 합 계산
        BigInteger result = a.add(b);

        // 결과 출력
        System.out.println(result);
    }
}
