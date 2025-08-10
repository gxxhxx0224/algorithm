import java.util.*;
import java.io.*;

/*
5567 결혼식
 */

public class Main {
    static int n,m,arr[][];
    static boolean check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine()); //동기의 수
        m=Integer.parseInt(br.readLine()); //리스트의 길이
        arr=new int[n+1][n+1];
        check=new boolean[n+1];

        for(int i=1;i<=m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            arr[a][b]=arr[b][a]=1;
        }

        int ans=0;
        check[1]=true;
        dfs(1,1);

        for(int i=2;i<=n;i++)
            if(check[i]) ans++;

        System.out.println(ans);
    }
    public static void dfs(int depth,int now){
        if(depth>=3)
            return;

        for(int i=1;i<=n;i++){
            if(arr[now][i]==1){
                check[i]=true;
                dfs(depth+1,i);
            }
        }
    }
}
