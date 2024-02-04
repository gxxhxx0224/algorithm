import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//dfs
public class OrganicCabbage {
    static boolean graph[][], visit[][];

    static int n,m,count;
    static int dx[] = {1, 0, -1, 0}, dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스의 수
        
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); //배추밭의 가로길이
            n = Integer.parseInt(st.nextToken()); //세로길이
            int k = Integer.parseInt(st.nextToken()); //배추가 심어진 위치의 개수
            graph = new boolean[n + 2][m + 2];
            visit = new boolean[n + 1][m + 1];


            for (int i = 1; i <= k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[y + 1][x + 1] = true;
            }
            count = 0;

            for(int y=1;y<=n;y++){
                for(int x=1;x<=m;x++){

                    if(graph[y][x] && !visit[y][x]) { //배추o, 지렁이x의 경우
                        //지렁이수 = dfs 호출횟수
                        count++;
                        dfs(x, y);
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int x, int y) {
        visit[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            //범위안에 있고 배추가 심어져있으며 지렁이가 없는경우
            if(nextX>=1 && nextX<=m && nextY>=1 && nextY<=n && graph[nextY][nextX] && !visit[nextY][nextX]){
                dfs(nextX, nextY);
            }
        }
    }
}
