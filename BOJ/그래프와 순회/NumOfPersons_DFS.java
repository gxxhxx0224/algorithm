import java.io.*;
import java.util.*;

//2644 촌수계산 dfs
public class Main{
    static int n,a,b,arr[][];
    static int min;
    static boolean check[];

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine()); //포도주 잔의 개수
        arr=new int[n][n];
        check=new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        a=Integer.parseInt(st.nextToken())-1;
        b=Integer.parseInt(st.nextToken())-1;

        int m=Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken())-1;
            int y=Integer.parseInt(st.nextToken())-1;

            arr[x][y]=arr[y][x]=1;
        }
        min=Integer.MAX_VALUE;
        dfs(a,0);
        System.out.print((min<Integer.MAX_VALUE?min:-1));
    }
    public static void dfs(int from,int count){
        if(from==b) {
            min=Math.min(min,count);
            return;
        }

        check[from]=true;

        for(int i=0;i<n;i++){
            if(!check[i] && arr[from][i]==1){
                dfs(i,count+1);
            }
        }
    }
}
