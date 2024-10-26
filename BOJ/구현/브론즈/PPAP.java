import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // 물건의 총 개수
        String items = br.readLine(); // 물체 목록 문자열
        
        String target = "pPAp"; // 찾고자 하는 문자열 패턴
        int count = 0; // 펜-파인애플-애플-펜 개수
        int i = 0;
        
        while (i <= n - 4) {
            if (items.startsWith(target, i)) {
                count++;
                i += 4; // 중복되지 않도록 패턴이 끝난 다음 인덱스부터 검색
            } else {
                i++;
            }
        }
        
        System.out.println(count);
    }
}
