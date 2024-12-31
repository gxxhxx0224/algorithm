import java.io.*;

//Top Down
public class Main {
    static int n,arr[];
    static Integer dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); //포도주 잔의 개수
        arr=new int[n+3];

        for(int i=1;i<=n;i++)
            arr[i]=Integer.parseInt(br.readLine());

        dp=new Integer[n+3];

        dp[0]=0;
        dp[1]=arr[1];
        dp[2]=arr[1]+arr[2];

        System.out.print(recur(n));
    }
    public static Integer recur(int idx){
        if(dp[idx]==null){
            dp[idx]=Math.max(recur(idx-1),Math.max(recur(idx-2),recur(idx-3)+arr[idx-1])+arr[idx]);
        }
        return dp[idx];
    }
}
