import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger a = new BigInteger(br.readLine().trim()); // a도 BigInteger로 받아도 무방
        BigInteger b = new BigInteger(br.readLine().trim());
        BigInteger c = new BigInteger(br.readLine().trim());
        
        BigInteger result = b.subtract(c).divide(a);
        System.out.println(result);
    }
}
