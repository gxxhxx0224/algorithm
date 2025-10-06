import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //수열의 길이
        int s=Integer.parseInt(st.nextToken()); //합이 s이상 되는 것

        int nums[]=new int[n+1];
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++)
            nums[i]=Integer.parseInt(st.nextToken());

        long sum=0L;
        int left=1;
        int right=1;
        int len=Integer.MAX_VALUE;

        while(true){
            if(sum>=s){
                len=Math.min(len,right-left);
                sum-=nums[left++];
            }else if(right<=n)
                sum+=nums[right++];
            else break;
        }
        System.out.print(len==Integer.MAX_VALUE?0:len);
    }
}
