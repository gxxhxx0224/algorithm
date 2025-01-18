import java.io.*;
import java.util.*;

//G4 9252 LCS 2(Bottom Up)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();

        int n=s1.length();
        int m=s2.length();

        int dp[][]=new int[n+1][m+1];

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        int i=n,j=m;

        while(i>=1 && j>=1){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j]>dp[i][j-1])
                i--;
            else j--;
        }
        System.out.println(dp[n][m]);
        System.out.print(sb.reverse());
    }
}
