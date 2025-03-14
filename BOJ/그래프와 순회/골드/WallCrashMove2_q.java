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

        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{1,1,1,0}); //y,x,거리,부순 개수
        check[1][1][0]=true;

        int minDist=Integer.MAX_VALUE;
        int maxCrash=Integer.MIN_VALUE;

        while(!q.isEmpty()){
            int y=q.peek()[0];
            int x=q.peek()[1];
            int dist=q.peek()[2];
            int crash=q.peek()[3];
            q.poll();

            if(y==n && x==m) {
                minDist=Math.min(minDist,dist);
                maxCrash=Math.max(maxCrash,crash);
            }

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
                        q.add(new int[]{ny, nx, nd, nc});
                        check[ny][nx][nc] = true;
                    }
                }
            }
        }
        if(maxCrash>=0)
            return minDist;
        return -1;
    }
}
