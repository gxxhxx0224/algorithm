import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        long sumA = 0;
        long sumB = 0;

        for (char c : A.toCharArray()) {
            sumA += c - '0';
        }
        for (char c : B.toCharArray()) {
            sumB += c - '0';
        }

        System.out.println(sumA * sumB);
    }
}
