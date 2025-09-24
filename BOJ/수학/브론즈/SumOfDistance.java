import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(x); // 정렬 필수

        long result = 0;
        long prefixSum = 0;

        for (int i = 0; i < n; i++) {
            result += x[i] * i - prefixSum;
            prefixSum += x[i];
        }

        System.out.println(result * 2); // i,j 쌍과 j,i 쌍 모두 포함
    }
}
