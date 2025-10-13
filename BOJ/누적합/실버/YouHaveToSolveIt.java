import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int q=Integer.parseInt(st.nextToken());

        int arr[]=new int[n+1];
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int prefix[]=new int[n+1];
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=q;i++){
            st=new StringTokenizer(br.readLine());
            int from=Integer.parseInt(st.nextToken());
            int to=Integer.parseInt(st.nextToken());

            int result=prefix[to]-prefix[from-1];
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
