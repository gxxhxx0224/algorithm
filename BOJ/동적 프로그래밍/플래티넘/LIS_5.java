import java.io.*;
import java.util.*;


//P5 14003 가장 긴 증가하는 부분 수열 5(LIS 5)
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //수열의 크기
        int a[]=new int[n+1]; //수열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++)
            a[i]=Integer.parseInt(st.nextToken());

        int list[]=new int[n+1];
        int length=0;
        list[0]=Integer.MIN_VALUE;

        int dp[]=new int[n+1];

        for(int i=1;i<=n;i++){
            if(list[length]<a[i]){
                list[++length]=a[i];
                dp[i]=length;
            }else{
                int low=1;
                int high=length;

                while(low<high){
                    int mid=(low+high)/2;

                    if(list[mid]<a[i])
                        low=mid+1;
                    else high=mid;
                }
                list[low]=a[i];
                dp[i]=low;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(length).append("\n");

        Stack<Integer>stack=new Stack<>();
        for(int i=n;i>=1;i--){
            if(length==dp[i]){
                length--;
                stack.push(a[i]);
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        System.out.print(sb);
    }
}
