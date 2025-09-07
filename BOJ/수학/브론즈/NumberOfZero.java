import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int count = 0;
            for (int i = N; i <= M; i++) {
                String s = String.valueOf(i);
                for (char c : s.toCharArray()) {
                    if (c == '0') count++;
                }
            }
            
            sb.append(count).append('\n');
        }
        
        System.out.print(sb.toString());
    }
}
