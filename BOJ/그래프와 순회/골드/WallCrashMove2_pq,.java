import java.util.*;
import java.io.*;

//G3 14442 벽 부수고 이동하기 2
public class Main {
    static int n,m,k,arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        arr=new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            String input=br.readLine();
            for(int j=1;j<=m;j++){
                arr[i][j]=input.charAt(j-1)-'0';
            }
        }
        System.out.print(bfs());
    }
    public static int bfs(){
        int[]dy={0,-1,0,1},dx={1,0,-1,0};
        boolean check[][][]=new boolean[n+1][m+1][k+1];

        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(o->o[2]));
        pq.add(new int[]{1,1,1,0}); //y,x,거리,부순 개수
        check[1][1][0]=true;

        int min=Integer.MAX_VALUE;

        while(!pq.isEmpty()){
            int y=pq.peek()[0];
            int x=pq.peek()[1];
            int dist=pq.peek()[2];
            int crash=pq.peek()[3];
            pq.poll();

            if(y==n && x==m)
                return dist;

            if(crash>k) continue;

            for(int i=0;i<4;i++){
                int ny=y+dy[i];
                int nx=x+dx[i];
                int nd=dist+1;
                int nc=crash;

                if(ny>=1 && ny<=n && nx>=1 && nx<=m){
                    if(arr[ny][nx]==1){
                        nc++;
                    }

                    if(nc<=k && !check[ny][nx][nc]) {
                        pq.add(new int[]{ny, nx, nd, nc});
                        check[ny][nx][nc] = true;
                    }
                }
            }
        }
        return -1;
    }
}
