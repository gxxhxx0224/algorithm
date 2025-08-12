import java.util.*;
import java.io.*;

//16234 G4 인구이동
public class Main{
    static int n,l,r,arr[][];
    static boolean check[][];
    static List<int[]>list;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken()); //땅 크기
        l=Integer.parseInt(st.nextToken()); //허용 차 최소
        r=Integer.parseInt(st.nextToken()); //허용 차 최대

        arr=new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            st=new StringTokenizer(br.readLine());

            for(int j=1;j<=n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        //루프 돌면서(1일차, 2일차,..)
        //bfs로 개방하는지 check하고
        //list에 개방하는 곳 좌표 저장해서, 이후 꺼내서 arr[y][x]=avg로 갱신
        int day=0;
        while(true) {
            boolean keep=false;
            check=new boolean[n+1][n+1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (!check[i][j]) {
                        list = new ArrayList<>();
                        int avg = bfs(i, j, arr[i][j]) / list.size();

                        if (list.size() > 1) {
                            for (int a[] : list) {
                                int y = a[0];
                                int x = a[1];

                                keep=true;
                                arr[y][x] = avg;
                            }
                        }
                    }
                }
            }
            if(!keep) break;
            day++;
        }
        System.out.print(day);
    }
    public static int bfs(int y,int x,int population){
        int dy[]={-1,1,0,0},dx[]={0,0,-1,1};
        int sum=0;

        Queue<int[]>q=new ArrayDeque<>();
        q.add(new int[]{y,x,population});
        check[y][x]=true;
        list.add(new int[]{y,x});
        sum+=arr[y][x];

        while(!q.isEmpty()){
            int a[]=q.poll();
            y=a[0];
            x=a[1];
            population=a[2];

            for(int i=0;i<4;i++){
                int ny=y+dy[i];
                int nx=x+dx[i];

                if(ny>=1 && ny<=n && nx>=1 && nx<=n && !check[ny][nx]){
                    int diff=Math.abs(population-arr[ny][nx]);
                    int next=arr[ny][nx];

                    if(diff>=l && diff<=r){
                        q.add(new int[]{ny,nx,next});
                        check[ny][nx]=true;
                        list.add(new int[]{ny,nx});
                        sum+=arr[ny][nx];
                    }
                }
            }
        }
        return sum;
    }
}
