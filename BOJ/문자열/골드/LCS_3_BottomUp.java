import java.io.*;
import java.util.*;

//G4 1958 LCS 3(Bottom Up)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=br.readLine();
        String s3=br.readLine();

        int a=s1.length();
        int b=s2.length();
        int c=s3.length();

        int dp[][][]=new int[a+1][b+1][c+1];

        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                for(int k=1;k<=c;k++){
                    if(s1.charAt(i-1)==s2.charAt(j-1) && s2.charAt(j-1)==s3.charAt(k-1)){
                        dp[i][j][k]=dp[i-1][j-1][k-1]+1;
                    }else{
                        dp[i][j][k]=Math.max(dp[i-1][j][k],Math.max(dp[i][j-1][k],dp[i][j][k-1]));
                    }
                }
            }
        }
        System.out.print(dp[a][b][c]);
    }
}
