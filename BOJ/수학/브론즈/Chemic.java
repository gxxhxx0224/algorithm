import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double prev = Double.parseDouble(br.readLine()); // 첫 번째 측정값
        while (true) {
            double cur = Double.parseDouble(br.readLine());
            if (cur == 999) break; // 종료 조건
            System.out.printf("%.2f\n", cur - prev); // 변화량 출력
            prev = cur; // 이전 값 갱신
        }
    }
}
