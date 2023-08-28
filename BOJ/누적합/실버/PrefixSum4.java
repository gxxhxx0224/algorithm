import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //개수
        int num[] = new int[n+1];
        int m = Integer.parseInt(st.nextToken()); //구해야 하는 횟수

        //누적합
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) num[i] = num[i - 1] + Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(num[b] - num[a - 1]).append("\n");
        }br.close();
        System.out.print(sb);

    }

}
