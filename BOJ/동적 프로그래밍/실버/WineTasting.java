import java.io.*;

//Bottom Up
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //포도주 잔의 개수
        int arr[]=new int[n+3];

        for(int i=1;i<=n;i++)
            arr[i]=Integer.parseInt(br.readLine());

        int dp[]=new int[n+3];

        dp[1]=arr[1];
        dp[2]=arr[1]+arr[2];

        if(n>=3){
            for(int i=3;i<=n;i++){
                dp[i]=Math.max(dp[i-1],Math.max(dp[i-2],dp[i-3]+arr[i-1])+arr[i]);
            }
        }
        System.out.print(dp[n]);
    }
}
