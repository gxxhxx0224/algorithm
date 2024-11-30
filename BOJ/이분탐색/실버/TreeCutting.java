import java.io.*;
import java.util.*;

public class Main {
    static int n,arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); //나무의 수
        int m=Integer.parseInt(st.nextToken()); //집에 가져갈 나무의 길이
        arr=new int[n];

        st=new StringTokenizer(br.readLine());
        int max=0;
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max=Math.max(max,arr[i]);
        }
        Arrays.sort(arr);

        long low=0; //높이의 최소
        long high=max; //높이의 최대값

        while(low<high-1){
            long mid=(low+high)/2;

            if(f(mid)<m) high=mid;
            else low=mid;
        }
        System.out.print(low);
    }
    public static long f(long height){
        long sum=0;

        for(int i=0;i<n;i++){
            if(arr[i]>height)
                sum+=(arr[i]-height);
        }
        return sum;
    }
}
