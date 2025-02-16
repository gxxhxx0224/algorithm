import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int squared = N * N;
            
            // 문자열 변환 후 뒤에서부터 원래 숫자의 길이만큼 비교
            String strN = String.valueOf(N);
            String strSquared = String.valueOf(squared);
            
            if (strSquared.endsWith(strN)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
