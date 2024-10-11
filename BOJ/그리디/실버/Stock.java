import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T=Integer.parseInt(br.readLine());

        for(int tc=1;tc<=T;tc++) {
            int n=Integer.parseInt(br.readLine());
            long arr[]=new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) arr[i]=Long.parseLong(st.nextToken());
            //역순으로 조회하면서 더함
            long max=0;
            long sum=0;
            for(int i=n-1;i>=0;i--){
                if(max<arr[i]){
                    max=arr[i];
                }else sum+=(max-arr[i]);
            }
            sb.append(sum+"\n");
        }
        System.out.print(sb);
    }
}
