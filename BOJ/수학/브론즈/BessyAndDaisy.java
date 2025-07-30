import java.util.*;
import java.io.*;

public class Main {
    static int[][] dirsBessie = {
        {-1, -1}, {-1, 0}, {-1, 1},
        {0, -1},          {0, 1},
        {1, -1}, {1, 0},  {1, 1}
    };
    static int[][] dirsDaisy = {
        {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int brR = Integer.parseInt(st.nextToken());
        int brC = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int drR = Integer.parseInt(st.nextToken());
        int drC = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int jr = Integer.parseInt(st.nextToken());
        int jc = Integer.parseInt(st.nextToken());

        int bessieTime = bfs(brR, brC, jr, jc, dirsBessie);
        int daisyTime = bfs(drR, drC, jr, jc, dirsDaisy);

        if (bessieTime < daisyTime) {
            System.out.println("bessie");
        } else if (bessieTime > daisyTime) {
            System.out.println("daisy");
        } else {
            System.out.println("tie");
        }
    }

    private static int bfs(int startR, int startC, int targetR, int targetC, int[][] directions) {
        boolean[][] visited = new boolean[1001][1001];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startR, startC, 0});
        visited[startR][startC] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            int time = curr[2];

            if (r == targetR && c == targetC) {
                return time;
            }

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 1 && nr <= 1000 && nc >= 1 && nc <= 1000 && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc, time + 1});
                }
            }
        }

        return Integer.MAX_VALUE;  // 도달 불가능한 경우
    }
}
