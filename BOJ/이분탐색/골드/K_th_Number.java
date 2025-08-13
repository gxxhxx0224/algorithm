import java.util.*;
import java.io.*;

//1300 G1 'K번째 수'
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //배열의 크기
        int k=Integer.parseInt(br.readLine()); //배열에서 몇번째 수 인지

        int low=1;
        int high=k;
        int answer=0;

        while(low<=high){
            int mid=(low+high)/2; //배열에 들어갈 수 있는 수 {1,2,3} 등
            int count=0;

            for(int i=1;i<=n;i++){
                count+=Math.min(n,mid/i);
            }

            if(count>=k){
                answer=mid;
                high=mid-1;
            }else low=mid+1;
        }
        System.out.print(answer);
    }
}
