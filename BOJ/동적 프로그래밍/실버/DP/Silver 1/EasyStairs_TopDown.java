import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Top Down
public class EasyStairs_TopDown {
    static int n,mod;
    static Long dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        mod=1000000000;
        dp=new Long[n+1][10];

        for(int i=0;i<10;i++){
            dp[1][i]=1L;
        }

        long sum=0;
        for(int i=1;i<10;i++) {
            sum=(sum+recur(n,i))%mod;
        }
        System.out.println(sum);
    }
    public static long recur(int depth, int idx){
        if(dp[depth][idx]==null){
            if(idx==0) dp[depth][idx]=recur(depth-1,1)%mod;
            else if(idx==9) dp[depth][idx]=recur(depth-1,8)%mod;
            else dp[depth][idx]=(recur(depth-1,idx-1)+recur(depth-1,idx+1))%mod;
        }
        return dp[depth][idx];
    }
}
