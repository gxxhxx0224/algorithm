import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n+1];
        int prefix[]=new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            prefix[i]=prefix[i-1]+arr[i];
        }

        StringBuilder sb = new StringBuilder();
        int m=Integer.parseInt(br.readLine()); //구간의 개수
        for(int i=1;i<=m;i++){
            st=new StringTokenizer(br.readLine());
            int from=Integer.parseInt(st.nextToken());
            int to=Integer.parseInt(st.nextToken());

            int sum=prefix[to]-prefix[from]+arr[from];
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
