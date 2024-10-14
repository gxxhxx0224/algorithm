import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m, time, arr[][];
    static int dy[] = {-1, 0, 1, 0}, dx[] = {0, 1, 0, -1}; //북동남서

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        time=0;

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken()); //로봇청소기가 있는 행
        int c = Integer.parseInt(st.nextToken()); //로봇청소기가 있는 열
        int d = Integer.parseInt(st.nextToken()); //0:북 1:동 2:남 3:서, 방향

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        arr[r][c] = 0;

        bfs(r,c,d);

        System.out.println(time);
    }

    public static void bfs(int y, int x, int dir) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y, x, dir});

        while (!q.isEmpty()) {
            y = q.peek()[0];
            x = q.peek()[1];
            dir=q.peek()[2];
            q.poll();

            boolean unCleaned=false;

            if(arr[y][x]==0){
                arr[y][x]=2; //청소한다.
                time++;
            }

            for(int i=0;i<4;i++){
                dir=(dir+3)%4; //반시계 방향 90도 회전
                int ny=y+dy[dir];
                int nx=x+dx[dir];

                if(ny>=0 && ny<n && nx>=0 && nx<m){
                    if(arr[ny][nx]==0){ //현재 칸의 주변 4칸 중, 청소되지 않은 빈 칸이 있는 경우

                        //바라보는 방향 기준으로, 앞쪽 칸이 청소되지 않은 빈칸인 경우
                        if(y+dy[dir]>=0 && y+dy[dir]<n && x+dx[dir]>=0 && x+dx[dir]<m &&
                            arr[y+dy[dir]][x+dx[dir]]==0){
                            q.add(new int[]{y+dy[dir], x+dx[dir],dir}); //한칸 전진
                            unCleaned=true;
                            break;
                        }
                    }
                }
            }
            //현재 칸의 주변 4칸 중 청소되지 않은 빈칸이 없는 경우
            if(!unCleaned){
                int ny=y+dy[(dir+2)%4];
                int nx=x+dx[(dir+2)%4];

                //한 칸 후진할 수 있다면
                if(ny>=0 && ny<n && nx>=0 && nx<m && arr[ny][nx]!=1){
                    q.add(new int[]{ny,nx,dir}); //바라보는 방향을 유지한 채로, 1칸 후진
                }else //후진할 수 없다면 작동멈춤
                    return;
            }

        }

    }
}
