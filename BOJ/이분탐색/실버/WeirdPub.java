import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //주전자 개수
        int k=Integer.parseInt(st.nextToken()); //친구 수

        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        boolean close=false;

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());

            max=Math.max(max,arr[i]);
        }

        long low=1;
        long high=max;

        while(low<=high){
            long mid=(low+high)/2;

            long count=0;
            for(int i=0;i<n;i++){
                count+=arr[i]/mid;
            }

            if(count<k) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.print(high);
    }
}
