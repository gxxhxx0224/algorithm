import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SafeZone {
    static int n, arr[][];
    static int dy[] = {0, -1, 0, 1}, dx[] = {1, 0, -1, 0};
    static boolean check[][];
    static Queue<int[]> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, arr[i][j]);
            }
        }

        int max = 0;

        for (int i = 0; i < maxHeight; i++) {
            check = new boolean[n][n];
            q = new LinkedList<>();
            int count = 0;

            for (int y = 0; y < n; y++) {
                for (int x = 0; x < n; x++) {
                    if (arr[y][x] <= i) check[y][x] = true;
                }
            }

            for (int y = 0; y < n; y++) {
                for (int x = 0; x < n; x++) {
                    if (!check[y][x]) {
                        q.add(new int[]{y, x});
                        bfs(i);
                        count++;
                    }
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }

    public static void bfs(int height) {
        while (!q.isEmpty()) {
            int y = q.peek()[0];
            int x = q.peek()[1];
            q.poll();

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny >= 0 && ny < n && nx >= 0 && nx < n && !check[ny][nx] && arr[ny][nx] > height) {
                    q.add(new int[]{ny,nx});
                    check[ny][nx] = true;
                }
            }
        }
    }
}
