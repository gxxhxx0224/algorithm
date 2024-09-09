import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BabyShark2 {
    static int n, m, arr[][];
    static int dy[] = {0, -1, -1, -1, 0, 1, 1, 1}, dx[] = {1, 1, 0, -1, -1, -1, 0, 1};
    static boolean check[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        check = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int max=Integer.MIN_VALUE; //안전거리의 최댓값

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    check=new boolean[n][m];
                    max=Math.max(max,bfs(i,j,0));
                }
            }
        }
        System.out.println(max);
    }

    //한점에서 8방향 탐색 및 거리 측정.
    //한점에서 상어까지의 최소거리=그 점의 거리
    //그 최소거리들 중에 최대값이 안전거리의 최댓값
    public static int bfs(int y, int x, int dist) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y, x, dist});
        check[y][x] = true;
        int min = Integer.MAX_VALUE; //점에서 상어까지 가장 가까운 거리

        while (!q.isEmpty()) {
            y = q.peek()[0];
            x = q.peek()[1];
            dist = q.peek()[2];
            q.poll();

            if (arr[y][x] == 1) {
                min = Math.min(min, dist);
            }

            for (int i = 0; i < 8; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny >= 0 && ny < n && nx >= 0 && nx < m && !check[ny][nx]) {
                    q.add(new int[]{ny, nx, dist + 1});
                    check[ny][nx] = true;
                }
            }
        }
        return min;
    }
}
