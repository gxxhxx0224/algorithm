import java.io.*;
import java.util.*;

//2644 촌수계산 bfs
public class Main{
    static int n,a,b,arr[][];
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
        System.out.print(bfs(a,0));
    }
    public static int bfs(int from, int count){
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{from,count});
        check[from]=true;

        while(!q.isEmpty()){
            from=q.peek()[0];
            count=q.peek()[1];
            q.poll();

            if(from==b){
                return count;
            }

            for(int i=0;i<n;i++){
                if(!check[i] && arr[from][i]==1){
                    q.add(new int[]{i,count+1});
                    check[i]=true;
                }
            }
        }
        return -1;
    }
}
