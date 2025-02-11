import java.io.*;
import java.util.*;


//S2 11722 "가장 긴 감소하는 부분 수열 4"
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //수열의 크기
        int a[]=new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++)
            a[i]=Integer.parseInt(st.nextToken());

        int list[]=new int[n+1];
        list[1]=a[1];
        int length=1;

        for(int i=2;i<=n;i++){
            int num=a[i];

            if(list[length]>num){
                list[++length]=num;
            }else{
                int low=1;
                int high=length;

                while(low<high){
                    int mid=(low+high)/2;

                    if(list[mid]>num){
                        low=mid+1;
                    }else high=mid;
                }
                list[low]=num;
            }
        }
        System.out.print(length);
    }
}
