import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        // M 이상 N 이하의 완전제곱수를 찾기 위한 시작값과 끝값
        int start = (int)Math.ceil(Math.sqrt(M));  // M의 제곱근을 올림
        int end = (int)Math.floor(Math.sqrt(N));   // N의 제곱근을 내림
        
        // 완전제곱수가 없는 경우
        if (start > end) {
            System.out.println(-1);
            return;
        }
        
        int sum = 0;
        int min = start * start;  // 최솟값은 첫 번째 완전제곱수
        
        // start부터 end까지의 수를 제곱하여 더함
        for (int i = start; i <= end; i++) {
            sum += i * i;
        }
        
        System.out.println(sum);
        System.out.println(min);
    }
}
