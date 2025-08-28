import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        // 형태 1: a ? b = c
        if (a + b == c) {
            sb.append(a).append("+").append(b).append("=").append(c);
        } else if (a - b == c) {
            sb.append(a).append("-").append(b).append("=").append(c);
        } else if (a * b == c) {
            sb.append(a).append("*").append(b).append("=").append(c);
        } else if (b != 0 && a % b == 0 && a / b == c) {
            sb.append(a).append("/").append(b).append("=").append(c);
        }
        // 형태 2: a = b ? c
        else if (a == b + c) {
            sb.append(a).append("=").append(b).append("+").append(c);
        } else if (a == b - c) {
            sb.append(a).append("=").append(b).append("-").append(c);
        } else if (a == b * c) {
            sb.append(a).append("=").append(b).append("*").append(c);
        } else if (c != 0 && b % c == 0 && a == b / c) {
            sb.append(a).append("=").append(b).append("/").append(c);
        }

        System.out.println(sb.toString());
    }
}
