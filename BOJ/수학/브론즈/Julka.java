import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger total = new BigInteger(scanner.nextLine()); // 총 사과 수 S
        BigInteger diff = new BigInteger(scanner.nextLine());  // 차이 D

        BigInteger klaudia = total.add(diff).divide(BigInteger.valueOf(2));
        BigInteger natalia = total.subtract(diff).divide(BigInteger.valueOf(2));

        System.out.println(klaudia);
        System.out.println(natalia);

        scanner.close();
    }
}
