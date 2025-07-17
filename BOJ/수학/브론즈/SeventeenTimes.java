import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2진수 입력
        String binary = sc.nextLine();

        // 2진수를 BigInteger로 변환
        BigInteger num = new BigInteger(binary, 2);

        // 17 곱하기
        BigInteger multiplied = num.multiply(BigInteger.valueOf(17));

        // 다시 2진수 문자열로 출력
        System.out.println(multiplied.toString(2));
    }
}
