import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // A의 길이
        int m = sc.nextInt(); // B의 길이
        String a = sc.next(); // A
        String b = sc.next(); // B

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        BigInteger result = bigA.multiply(bigB);

        System.out.println(result.toString());
    }
}
