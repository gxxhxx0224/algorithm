import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int arr[][];
    static Integer dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        arr=new int[n][m];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        dp=new Integer[n][m];
        dp[0][0]=arr[0][0];

        recur(n-1,m-1);
        System.out.print(dp[n-1][m-1]);

    }
    public static int recur(int y,int x){
        if(dp[y][x]==null){
            if(y-1>=0 && x-1>=0){
                dp[y][x]=arr[y][x]+Math.max(recur(y-1,x),Math.max(recur(y-1,x-1),recur(y,x-1)));
            }
            else{
                if(y-1>=0) dp[y][x]=arr[y][x]+recur(y-1,x);
                else if(x-1>=0) dp[y][x]=arr[y][x]+recur(y,x-1);
            }
        }
        return dp[y][x];
    }
}
