import java.io.*;
import java.util.*;

public class Main {
    static int arr[][],dy[]={0,1,0,-1},dx[]={1,0,-1,0};
    static int n,m;
    static boolean[][][] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        arr=new int[n][m];
        check=new boolean[n][m][2];

        for(int i=0;i<n;i++){
            String s=br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j]=s.charAt(j)-'0';
            }
        }
        System.out.print(bfs(0,0,0,1));
    }
    public static int bfs(int y,int x,int bomb,int dist){
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{y,x,bomb,dist});
        check[y][x][bomb]=true;

        while(!q.isEmpty()){
            y=q.peek()[0];
            x=q.peek()[1];
            bomb=q.peek()[2];
            dist=q.peek()[3];
            q.poll();

            if(y==n-1 && x==m-1)
                return dist;

            for(int i=0;i<4;i++){
                int ny=y+dy[i];
                int nx=x+dx[i];

                if(ny>=0 && ny<n && nx>=0 && nx<m && !check[ny][nx][bomb]){
                    if(arr[ny][nx]==0){
                        q.add(new int[]{ny,nx,bomb,dist+1});
                        check[ny][nx][bomb]=true;
                    }else if(bomb==0){
                        q.add(new int[]{ny,nx,1,dist+1});
                        check[ny][nx][bomb]=true;
                    }
                }
            }
        }
        return -1;
    }
}
