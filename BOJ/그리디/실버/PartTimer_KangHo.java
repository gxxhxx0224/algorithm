import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());

        Arrays.sort(arr,Collections.reverseOrder());

        long ans=0;
        for(int i=0;i<n;i++){
            int sum=arr[i]-i;

            if(sum>0) ans+=sum;
        }
        System.out.print(ans);
    }
}
