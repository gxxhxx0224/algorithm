import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n + 1];
        int prefix[] = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<n;i++){
            int add;
            add=arr[i]>arr[i+1]?1:0;
            prefix[i]=prefix[i-1]+add;
        }

        StringBuilder sb = new StringBuilder();

        int q = Integer.parseInt(br.readLine());
        for (int i = 1; i <= q; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            //맨끝(to)는 비교 안하니까 to-1
            //시작 이전까지 누적된 실수를 빼야하니 from-1
            int result=prefix[to-1]-prefix[from-1];

            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
