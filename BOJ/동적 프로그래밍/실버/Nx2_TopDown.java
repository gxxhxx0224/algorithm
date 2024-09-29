import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Top Down
public class Main {
    static Integer dp[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        dp=new Integer[n+2];

        dp[1]=1;
        dp[2]=3;

        recur(n);
        System.out.print(dp[n]);
    }
    public static int recur(int n){
        if(dp[n]==null){
            dp[n]=(recur(n-2)*2+recur(n-1))%10007;
        }
        return dp[n];
    }
}
