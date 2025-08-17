import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long c = Long.parseLong(br.readLine()); // C(1) 입력
        int n = 1; // C(1)이 이미 첫 항이므로 n = 1부터 시작

        while (c != 1) {
            if (c % 2 == 0) {
                c /= 2;
            } else {
                c = 3 * c + 1;
            }
            n++;
        }

        System.out.println(n);
    }
}
