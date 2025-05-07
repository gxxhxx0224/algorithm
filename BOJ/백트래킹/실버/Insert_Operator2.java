import java.io.*;
import java.util.*;

public class Main {
    static int n, a[], max, min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++)
            a[i] = Integer.parseInt(st.nextToken());

        int order[] = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 4; i++)
            order[i] = Integer.parseInt(st.nextToken());

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        dfs(2,order[1],order[2],order[3],order[4],a[1]);

        System.out.print(max+"\n"+min);
    }
    public static void dfs(int depth,int sum,int sub,int mul,int div, int total){
        if(depth==n+1){
            max=Math.max(max,total);
            min=Math.min(min,total);
            return;
        }

        if(sum>0)
            dfs(depth+1,sum-1,sub,mul,div,total+a[depth]);
        if(sub>0)
            dfs(depth+1,sum,sub-1,mul,div,total-a[depth]);
        if(mul>0)
            dfs(depth+1,sum,sub,mul-1,div,total*a[depth]);
        if(div>0){
            if(total<0)
                dfs(depth+1,sum,sub,mul,div-1,-(-total/a[depth]));
            else
                dfs(depth+1,sum,sub,mul,div-1,total/a[depth]);
        }
    }
}
