import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//top down
public class ContinuousSum_TopDown {
    static int n,max,arr[];
    static Integer dp[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        dp=new Integer[n];
        dp[0]=arr[0];

        recur(n-1);

        max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) max=Math.max(max,dp[i]);

        System.out.println(max);
    }
    public static int recur(int idx){
        if(dp[idx]==null){
           dp[idx]=Math.max(recur(idx-1)+arr[idx],arr[idx]);
        }
        return dp[idx];
    }
}
