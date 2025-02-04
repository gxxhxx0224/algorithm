import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 멀티탭 개수
        int totalPlugs = 0; // 총 사용할 수 있는 플러그 개수
        
        for (int i = 0; i < N; i++) {
            int plugs = Integer.parseInt(br.readLine());
            totalPlugs += plugs;
        }
        
        // 멀티탭이 1개 이상이라면 멀티탭 개수 - 1 만큼 겹치므로 빼줌
        System.out.println(totalPlugs - (N - 1));
    }
}
