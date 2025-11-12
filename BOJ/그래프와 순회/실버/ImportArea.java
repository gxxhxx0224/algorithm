import java.io.*;
import java.util.*;

//2583 S1 '영역 구하기'
public class Main {
    static int y,x,k;
    static boolean check[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        y=Integer.parseInt(st.nextToken());
        x=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        check=new boolean[y+1][x+1];

        for(int i=0;i<k;i++){
            st=new StringTokenizer(br.readLine());
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());

            for(int yy=y1;yy<y2;yy++){
                for(int xx=x1;xx<x2;xx++){
                    check[yy][xx]=true;
                }
            }
        }

        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int count=0;
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                if(!check[i][j]){
                    pq.add(solve(i,j));
                    count++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");

        for(int i=0;i<count;i++)
            sb.append(pq.poll()).append(" ");

        System.out.print(sb);
    }
    static int solve(int sy,int sx){
        Queue<int[]>q=new ArrayDeque<>();
        q.add(new int[]{sy,sx});
        check[sy][sx]=true;

        int count=0;
        int dy[]={-1,1,0,0},dx[]={0,0,-1,1};

        while(!q.isEmpty()){
            int a[]=q.poll();
            sy=a[0];
            sx=a[1];
            count++;

            for(int i=0;i<4;i++){
                int ny=sy+dy[i];
                int nx=sx+dx[i];

                if(ny>=0 && ny<y && nx>=0 && nx<x && !check[ny][nx]){
                    q.add(new int[]{ny,nx});
                    check[ny][nx]=true;
                }
            }
        }
        return count;
    }
}
