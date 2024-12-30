import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 입력받을 수의 개수
        long[] numbers = new long[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Long.parseLong(br.readLine());
        }

        // 10^6 이하의 소수를 구하기 위해 에라토스테네스의 체 사용
        final int MAX = 1_000_000;
        boolean[] isNotPrime = new boolean[MAX + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= MAX; i++) {
            if (!isNotPrime[i]) {
                primes.add(i);
                for (long j = (long) i * i; j <= MAX; j += i) {
                    isNotPrime[(int) j] = true;
                }
            }
        }

        // 주어진 숫자들이 적절한 암호 키인지 확인
        for (long s : numbers) {
            boolean isValid = true;

            for (int prime : primes) {
                if ((long) prime * prime > s) break; // 더 이상 나눌 필요 없음
                if (s % prime == 0) {
                    isValid = false;
                    break;
                }
            }

            // 소인수로 나눠지지 않았다면 남은 값이 소수인지 확인
            if (isValid && !isPrime(s, primes)) {
                isValid = false;
            }

            sb.append(isValid ? "YES" : "NO").append("\n");
        }

        // 결과 출력
        System.out.print(sb);
    }

    // 소수가 아닌 숫자를 빠르게 확인
    private static boolean isPrime(long n, List<Integer> primes) {
        if (n <= 1) return false;
        for (int prime : primes) {
            if ((long) prime * prime > n) break;
            if (n % prime == 0) return false;
        }
        return true;
    }
}
