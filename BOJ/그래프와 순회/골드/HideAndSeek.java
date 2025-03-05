import java.util.*;
import java.io.*;

public class Main {
    static int n,k,max,arr[];
    static boolean check[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n =Integer.parseInt(st.nextToken()); //수빈 위치
        k =Integer.parseInt(st.nextToken()); //동생 위치

        max=100000;

        arr=new int[max+1];
        check=new boolean[max+1];

        System.out.print(bfs(n));
    }
    public static int bfs(int now){
        int time=0;
        int min=Integer.MAX_VALUE;

        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{now,time});
        check[now]=true;

        while(!q.isEmpty()){
            now=q.peek()[0];
            time=q.peek()[1];
            q.poll();

            if(now==k)
                min=Math.min(min,time);

            if(now*2<=max && !check[now*2]){
                q.add(new int[]{now*2,time});
                check[now*2]=true;
            }if(now-1>=0 && !check[now-1]){
                q.add(new int[]{now-1,time+1});
                check[now-1]=true;
            }if(now+1<=max && !check[now+1]){
                q.add(new int[]{now+1,time+1});
                check[now+1]=true;
            }
        }
        return min;
    }
}
