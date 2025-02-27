import java.util.*;
import java.io.*;

public class Main {
    static Queue<int[]> q;
    static int n, arr[][];
    static boolean check[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //크기
        int k = Integer.parseInt(st.nextToken()); //바이러스 개수

        arr = new int[n + 1][n + 1];
        check = new boolean[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); //s초 후
        int Y = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        q = new LinkedList<>();

        int virus = 1;
        while (virus <= k) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (arr[i][j] == virus) {
                        q.add(new int[]{i, j, virus, 0});
                        check[i][j] = true;
                    }
                }
            }
            virus++;
        }
        System.out.print(bfs(S, Y, X));
    }

    public static int bfs(int S, int Y, int X) {
        int dy[] = {0, 1, 0, -1}, dx[] = {1, 0, -1, 0};
        int time=0;

        while (time<S) {
            if(q.isEmpty()) break;

            int y = q.peek()[0];
            int x = q.peek()[1];
            int virus = q.peek()[2];
            time = q.peek()[3];
            q.poll();

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny >= 1 && ny <= n && nx >= 1 && nx <= n && arr[ny][nx] == 0 && !check[ny][nx]) {
                    q.add(new int[]{ny, nx, virus, time + 1});
                    arr[ny][nx] = virus;
                    check[ny][nx] = true;
                }
            }
            time++;
        }
        return arr[Y][X];
    }
}
