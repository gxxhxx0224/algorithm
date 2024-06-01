import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllPermutation {
    static int n,num[],arr[];
    static boolean check[];
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        num=new int[n+1];
        arr=new int[n];
        check=new boolean[n+1];

        for(int i=1;i<=n;i++)
            num[i]=i;

        sb=new StringBuilder();
        dfs(0);

        System.out.print(sb);
    }
    public static void dfs(int depth){
        if(depth==n){
            for(int val:arr){
                sb.append(val+" ");
            }sb.append("\n");
            return;
        }

        for(int i=1;i<=n;i++){
            if(!check[i]){
                check[i]=true;
                arr[depth]=i;
                dfs(depth+1);
                check[i]=false;
            }
        }
    }
}
