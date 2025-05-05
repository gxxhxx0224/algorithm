import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int arr[]=new int[n+1];

        st=new StringTokenizer(br.readLine());
        int sum=0;
        int time=0;
        for(int i=1;i<=n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum+=arr[i];

            if(i>l)
                sum-=arr[i-l];

            if(sum>=129 && sum<=138)
                time++;
        }
        System.out.print(time);
    }
}
