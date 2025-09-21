import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        for (long i = 10; i <= n; i *= 10) {
            n = (n + i / 2) / i * i; // 반올림 처리
        }

        System.out.println(n);
    }
}
