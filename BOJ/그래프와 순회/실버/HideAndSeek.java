import java.util.*;
import java.io.*;

//1697 숨바꼭질
public class Main {
    static int n,k,min;
    static boolean check[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); //수빈이의 위치
        k=Integer.parseInt(st.nextToken()); //동생의 위치
        min=Integer.MAX_VALUE;
        check=new boolean[100001];

        bfs(0,k);

        System.out.print(min);
    }
    public static void bfs(int time,int now){
        Queue<int[]>q=new ArrayDeque<>();
        q.add(new int[]{time,now});
        check[now]=true;

        while(!q.isEmpty()){
            int a[]=q.poll();
            time=a[0];
            now=a[1];

            if(now==n){
                min=Math.min(min,time);
            }

            if(now%2==0 && now/2>=0 && !check[now/2]) {
                q.add(new int[]{time + 1, now / 2});
                check[now / 2]=true;
            }
            if(now+1<=100000 && !check[now+1]) {
                q.add(new int[]{time + 1, now + 1});
                check[now+1]=true;
            }
            if(now-1>=0 && !check[now-1]) {
                q.add(new int[]{time + 1, now - 1});
                check[now - 1]=true;
            }
        }
    }
}

