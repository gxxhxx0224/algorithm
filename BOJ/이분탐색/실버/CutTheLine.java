import java.util.*;
import java.io.*;

public class Main {
    static int k,n,arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        k=Integer.parseInt(st.nextToken()); //이미 갖고있는 랜선개수
        n=Integer.parseInt(st.nextToken()); //필요한 랜선개수

        arr=new int[k];
        int max=0;
        for(int i=0;i<k;i++){
            arr[i]=Integer.parseInt(br.readLine());
            max=Math.max(max,arr[i]);
        }

        int count=k;

        long low=1;
        long high=max;

        while(low<=high){
            long mid=(low+high)/2;

            if(f(mid)<n) high=mid-1;
            else low=mid+1;
        }
        System.out.println(high);
    }
    public static int f(long length){
        int count=0;
        for(int i=0;i<k;i++){
            count+=arr[i]/length;
        }
        return count;
    }
}
