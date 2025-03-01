import java.util.*;
import java.io.*;

//G5 2589 보물섬
public class Main {
    static int n,m;
    static char arr[][];
    static boolean check[][];
    static Queue<int[]>q;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n =Integer.parseInt(st.nextToken());
        m =Integer.parseInt(st.nextToken());
        arr=new char[n][m];

        for(int i=0;i<n;i++){
            String input=br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j]=input.charAt(j);
            }
        }

        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='L') {
                    check=new boolean[n][m];
                    max=Math.max(bfs(i, j, 0),max);
                }
            }
        }
        System.out.print(max);
    }
    public static int bfs(int y,int x, int dist){
        int dy[]={0,-1,0,1}, dx[]={1,0,-1,0};

        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{y,x,dist});
        check[y][x]=true;

        int maxDist=0;
        while(!q.isEmpty()){
            y=q.peek()[0];
            x=q.peek()[1];
            dist=q.peek()[2];
            q.poll();

            maxDist=Math.max(maxDist,dist);

            for(int i=0;i<4;i++){
                int ny=y+dy[i];
                int nx=x+dx[i];

                if(ny>=0 && ny<n && nx>=0 && nx<m && arr[ny][nx]=='L' && !check[ny][nx]){
                    q.add(new int[]{ny,nx,dist+1});
                    check[ny][nx]=true;
                }
            }
        }
        return maxDist;
    }
}
