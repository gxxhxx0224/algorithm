import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(findLargestGoldenNumber(N));
    }

    private static int findLargestGoldenNumber(int N) {
        for (int i = N; i >= 4; i--) {
            if (isGoldenNumber(i)) {
                return i;
            }
        }
        return 4; // 최소값 보장
    }

    private static boolean isGoldenNumber(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
