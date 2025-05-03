import java.io.*;
import java.util.*;

public class Main {
    static int n,s,count,arr[];
    static boolean check[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        s=Integer.parseInt(st.nextToken());
        arr=new int[n+1];
        check=new boolean[n+1];

        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        count=0;
        dfs(1,0,1);
        System.out.print(count);
    }
    public static void dfs(int depth,int sum,int at){
        if(depth>1 && sum==s){
            count++;
        }

        for(int i=at;i<=n;i++){
            if(!check[i]){
                check[i]=true;
                dfs(depth+1,sum+arr[i],i);
                check[i]=false;
            }
        }
    }
}

