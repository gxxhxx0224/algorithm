import java.util.*;
import java.io.*;

public class Main {
    // 두 수의 GCD
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 세 수의 GCD
    private static int gcd(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int commonGcd;
        if (n == 2) {
            commonGcd = gcd(nums[0], nums[1]);
        } else {
            commonGcd = gcd(nums[0], nums[1], nums[2]);
        }

        // 공약수 출력
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= commonGcd; i++) {
            if (commonGcd % i == 0) {
                divisors.add(i);
            }
        }

        Collections.sort(divisors);
        for (int d : divisors) {
            System.out.println(d);
        }
    }
}
