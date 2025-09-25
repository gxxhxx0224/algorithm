import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuilder sb = new StringBuilder();

        while ((s = br.readLine()) != null) {
            if (s.equals("#")) break;

            long value = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int digit;
                switch (c) {
                    case '-': digit = 0; break;
                    case '\\': digit = 1; break; // backslash
                    case '(': digit = 2; break;
                    case '@': digit = 3; break;
                    case '?': digit = 4; break;
                    case '>': digit = 5; break;
                    case '&': digit = 6; break;
                    case '%': digit = 7; break;
                    case '/': digit = -1; break;
                    default:
                        // 문제 조건상 나올 수 없음. 안전하게 0 처리.
                        digit = 0;
                }
                value = value * 8 + digit;
            }

            sb.append(value).append('\n');
        }

        System.out.print(sb.toString());
    }
}
