import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int divisor[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        br.close();

        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            divisor[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, divisor[i]);
            max = Math.max(max, divisor[i]);
        }StringBuilder sb = new StringBuilder();
        sb.append(min * max);
        System.out.print(sb);
    }
}
