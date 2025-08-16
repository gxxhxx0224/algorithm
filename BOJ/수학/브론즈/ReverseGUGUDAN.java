import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 단
        int K = Integer.parseInt(st.nextToken()); // 항 개수
        
        int maxVal = 0;
        
        for (int i = 1; i <= K; i++) {
            int result = N * i;
            int reversed = reverseNumber(result);
            if (reversed > maxVal) {
                maxVal = reversed;
            }
        }
        
        System.out.println(maxVal);
    }
    
    // 숫자를 뒤집는 메서드
    private static int reverseNumber(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}
