import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        String pStr = st.nextToken();
        int k = Integer.parseInt(st.nextToken());

        BigInteger P = new BigInteger(pStr);

        // 에라토스테네스의 체로 k 미만의 소수를 구합니다.
        boolean[] isPrime = new boolean[k];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        if (k > 1) isPrime[1] = false;

        for (int i = 2; i * i < k; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < k; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // K 미만 소수로 나눠보기
        boolean good = true;
        for (int i = 2; i < k; i++) {
            if (isPrime[i]) {
                BigInteger divisor = BigInteger.valueOf(i);
                if (P.mod(divisor).equals(BigInteger.ZERO)) {
                    System.out.println("BAD " + i);
                    good = false;
                    break;
                }
            }
        }

        if (good) {
            System.out.println("GOOD");
        }
    }
}
