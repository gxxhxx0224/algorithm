import java.util.*;
import java.io.*;

//6236 S1 용돈관리
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        //m번 인출해서 n번의 지출을 모두 해결하는 고정 금액 k를 구하는 문제
        int arr[]=new int[n];

        int low=0;
        int high=0;
        for(int i=0;i<n;i++) {
            int num = Integer.parseInt(br.readLine());

            arr[i] = num;
            high+=num;
            low=Math.max(low,num);
        }

        while(low<=high){
            int mid=(low+high)/2;

            int money=0;
            int count=0;

            for(int i=0;i<n;i++){
                if(money>=arr[i]){
                    money-=arr[i];
                }else{
                    money=mid-arr[i];
                    count++;
                }
            }
            if(count>m){
                low=mid+1;
            }else
                high=mid-1;
        }
        System.out.print(low);
    }
}
