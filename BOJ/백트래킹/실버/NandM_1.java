import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NandM_1 {
    static int arr[];
    static boolean check[];
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        arr=new int[m];
        check=new boolean[n +1];

        sb=new StringBuilder();

        dfs(n,m,0);
        System.out.print(sb);
    }
    public static void dfs(int n,int m,int depth){
        if(depth==m){
            for(int val:arr)
                sb.append(val+" ");
            sb.append("\n");
            return;
        }

        for(int i=1;i<=n;i++){
            if(!check[i]){
                check[i]=true;
                arr[depth]=i;
                dfs(n,m,depth+1);
                check[i]=false;
            }
        }
    }
}
