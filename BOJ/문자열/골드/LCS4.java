import java.io.*;
import java.util.*;

//G2 12015 "가장 긴 증가하는 부분 수열 2" LIS 2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++)
            a[i]=Integer.parseInt(st.nextToken());

        int lis[]=new int[n+1];
        lis[1]=a[1];
        int last=1;

        for(int i=2;i<=n;i++){
            int num=a[i];

            if(lis[last]<num){
                last++;
                lis[last]=num;
            }else{
                int low=0;
                int high=last;

                while(low<high){
                    int mid=(low+high)/2;

                    if(lis[mid]<num)
                        low=mid+1;
                    else high=mid;
                }
                lis[low]=num;
            }
        }
        System.out.print(last);
    }
}
