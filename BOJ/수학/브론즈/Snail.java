import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // 행
        int N = sc.nextInt(); // 열

        boolean[][] visited = new boolean[M][N];
        int[] dx = {0, 1, 0, -1}; // 우, 하, 좌, 상
        int[] dy = {1, 0, -1, 0};

        int x = 0, y = 0, dir = 0;
        visited[x][y] = true;
        int turn = 0;

        for (int i = 1; i < M * N; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || nx >= M || ny < 0 || ny >= N || visited[nx][ny]) {
                dir = (dir + 1) % 4; // 방향 전환
                turn++;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
            visited[x][y] = true;
        }

        System.out.println(turn);
    }
}
