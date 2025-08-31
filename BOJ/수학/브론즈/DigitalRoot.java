import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    // 디지털 루트를 계산하는 메소드
    private static int digitalRoot(String num) {
        int sum = 0;
        for (char c : num.toCharArray()) {
            sum += c - '0';
        }
        // 한 자리 수가 될 때까지 반복
        if (sum >= 10) {
            return digitalRoot(String.valueOf(sum));
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();

        while (!(input = br.readLine()).equals("0")) {
            sb.append(digitalRoot(input)).append("\n");
        }

        System.out.print(sb);
    }
}
