import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//17836 공주님을 구해라!
public class SavePrincess {
    static int n, m, t, arr[][];
    static int dy[] = {0, -1, 0, 1}, dx[] = {1, 0, -1, 0};
    static boolean check[][], gramChk[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //세로
        m = Integer.parseInt(st.nextToken()); //가로
        t = Integer.parseInt(st.nextToken()); //시간제한
        arr = new int[n][m];
        check = new boolean[n][m]; //그램을 찾기전의 체크배열
        gramChk = new boolean[n][m]; //그램을 찾은후의 체크배열

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int time = bfs(0, 0, 0, 0);

        if (time > t) System.out.println("Fail");
        else System.out.println(time);
    }

    public static int bfs(int y, int x, int time, int gram) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{y, x, time, 0});
        check[y][x] = true;
        int min = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            y = q.peek()[0];
            x = q.peek()[1];
            time = q.peek()[2];
            gram = q.peek()[3];
            q.poll();

            if (y == n - 1 && x == m - 1) {
                min = Math.min(min, time);
            }

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                //범위 안에 있을경우
                if (ny >= 0 && ny < n && nx >= 0 && nx < m) {
                    if (gram == 1 && !gramChk[ny][nx]) { //그램을 가진 경우
                        q.add(new int[]{ny, nx, time + 1, 1});
                        gramChk[ny][nx] = true;
                    }
                    else { //그램이 없는경우
                        if (!check[ny][nx]) {
                            if (arr[ny][nx] == 2) { //그램 획득
                                //그램 획득시 n,m으로 직행하도록?
                                q.add(new int[]{ny, nx, time + 1, 1});
                                check[ny][nx] = true;
                            } else if (arr[ny][nx] == 0) { //그램 미획득시
                                q.add(new int[]{ny, nx, time + 1, 0});
                                check[ny][nx] = true;
                            }
                        }
                    }
                }
            }
        }
        return min;
    }
}
