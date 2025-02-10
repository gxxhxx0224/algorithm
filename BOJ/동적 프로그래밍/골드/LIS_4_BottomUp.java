import java.io.*;
import java.util.*;


//G4 14002 "가장 긴 증가하는 부분 수열 4" Bottom Up
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++)
            a[i]=Integer.parseInt(st.nextToken());

        int dp[]=new int[n+1];
        Arrays.fill(dp,1);
        int length=1;

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(a[i]<a[j]){
                    dp[j]=Math.max(dp[i]+1,dp[j]);
                    length=Math.max(length,dp[j]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(length).append("\n");

        int idx=n;
        Stack<Integer>stack=new Stack<>();

        while(idx>0 && length>0){
            if(dp[idx]==length){
                stack.push(a[idx]);
                length--;
            }
            idx--;
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        System.out.print(sb);
    }
}
