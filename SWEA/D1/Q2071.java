import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=0;tc<T;tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum=0;
            for(int i=0;i<10;i++){
                sum+=Integer.parseInt(st.nextToken());
            }
            sb.append('#').append(tc+1).append(' ');
            if(sum%10 >=5) sb.append(sum/10+1).append('\n');
            else sb.append(sum/10).append('\n');
        }br.close();
        System.out.print(sb);

    }
}
