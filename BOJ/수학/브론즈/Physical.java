import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Physical {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문제에서 정수의 범위가 int의 범위를 초과하므로
        long n = Integer.parseInt(br.readLine());
        br.close();
        System.out.print(4 * n);
    }
}
