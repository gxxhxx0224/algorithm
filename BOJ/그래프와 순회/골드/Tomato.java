import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
    static int m,n,ans;
    static int arr[][],dy[]={0,1,0,-1,},dx[]={1,0,-1,0};
    static Queue<int []>q=new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());
        arr=new int[n][m];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());

                if(arr[i][j]==1) q.add(new int[]{i,j,0});
            }
        }
        ans=0;
        bfs();
        System.out.println(check());

    }
    public static void bfs(){
        while(!q.isEmpty()){
            int y=q.peek()[0];
            int x=q.peek()[1];
            int day=q.peek()[2];
            q.poll();

            for(int i=0;i<4;i++){
                int nextY=y+dy[i];
                int nextX=x+dx[i];
                int nextDay=day+1;

                if(nextY>=0 && nextY<n && nextX>=0 && nextX<m && arr[nextY][nextX]==0){
                    q.add(new int[]{nextY,nextX,nextDay});
                    arr[nextY][nextX]=1;
                    ans=Math.max(ans,nextDay);
                }
            }
        }
    }
    public static int check(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0) return ans=-1;
            }
        }
        return ans;
    }
}
