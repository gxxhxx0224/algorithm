import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Knapsack_BottomUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //물품의 수
        int k=Integer.parseInt(st.nextToken()); //준서가 버틸 수 있는 무게
        int dp[][]=new int[n+1][k+1];

        int arr[][]=new int[n+1][2];
        for(int i=1;i<=n;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken()); //무게
            arr[i][1]=Integer.parseInt(st.nextToken()); //가치
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                if(arr[i][0]>j) dp[i][j]=dp[i-1][j];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-arr[i][0]]+arr[i][1]);
            }
        }
        System.out.print(dp[n][k]);
    }
}
