import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class make1_TopDown {
    static int dp[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //정수 N
        dp=new int[n+1]; //각 인덱스에 해당되는 수의 연산횟수 배열
        dp[0]=dp[1]=0; //1은 0회

        for(int i=2;i<=n;i++){
            recur(i);
        }
        System.out.print(dp[n]);
    }
    public static void recur(int num){
        if(num%6==0){
            dp[num]=Math.min(dp[num/3],Math.min(dp[num/2],dp[num-1]))+1;
        }
        else if(num%3==0){
            dp[num]=Math.min(dp[num/3],dp[num-1])+1;
        }
        else if(num%2==0){
            dp[num]=Math.min(dp[num/2],dp[num-1])+1;
        }
        else{
            dp[num]=dp[num-1]+1;
        }
    }
}
