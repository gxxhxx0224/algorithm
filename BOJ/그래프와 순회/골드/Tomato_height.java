import java.io.*;
import java.util.*;

public class Main {
    static int m, n, h, arr[][][];
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken()); //가로
        n = Integer.parseInt(st.nextToken()); //세로
        h = Integer.parseInt(st.nextToken()); //높이

        arr = new int[n][m][h];

        for (int height = 0; height < h; height++) {
            for (int y = 0; y < n; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < m; x++) {
                    arr[y][x][height] = Integer.parseInt(st.nextToken());

                    if (arr[y][x][height] == 1) q.add(new int[]{y, x, height, 0});
                }
            }
        }
        int ans = bfs();
        for (int height = 0; height < h; height++) {
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (arr[y][x][height] == 0) {
                        System.out.print(-1);
                        return;
                    }
                }
            }
        }
        System.out.print(ans);
    }

    public static int bfs() {
        int[] dy = {-1, 0, 1, 0}, dx = {0, 1, 0, -1}, dt = {1, -1};
        int max = 0;
        while (!q.isEmpty()) {
            int y = q.peek()[0];
            int x = q.peek()[1];
            int t = q.peek()[2];
            int count = q.peek()[3];
            q.poll();

            max=Math.max(max,count);

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny >= 0 && ny < n && nx >= 0 && nx < m && arr[ny][nx][t] == 0) {
                    arr[ny][nx][t] = 1;
                    q.add(new int[]{ny, nx, t, count + 1});
                }
            }
            for (int i = 0; i < 2; i++) {
                int nt = t + dt[i];

                if (nt >= 0 && nt < h && arr[y][x][nt] == 0) {
                    arr[y][x][nt] = 1;
                    q.add(new int[]{y, x, nt, count + 1});
                }
            }
        }
        return max;
    }
}
