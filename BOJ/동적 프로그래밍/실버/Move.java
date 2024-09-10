import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Move {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int dp[][]=new int[n][m];
        dp[0][0]=arr[0][0];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i-1>=0 && j-1>=0){
                    dp[i][j]=arr[i][j]+Math.max(dp[i-1][j-1],Math.max(dp[i-1][j],dp[i][j-1]));
                }
                else{
                    if(i-1>=0){
                        dp[i][j]=arr[i][j]+dp[i-1][j];
                    }
                    else if(j-1>=0){
                        dp[i][j]=arr[i][j]+dp[i][j-1];
                    }
                }
            }
        }
        System.out.print(dp[n-1][m-1]);

    }
}
