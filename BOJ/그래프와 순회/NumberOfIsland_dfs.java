import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberOfIsland_dfs {
    static int w, h;
    //8방향
    static int dx[] = {1, 0, -1, 0, 1, -1, -1, 1};
    static int dy[] = {0, 1, 0, -1, 1, 1, -1, -1};
    static boolean arr[][], check[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        w = -1;
        h = -1;

        while (true) {
            st=new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken()); //너비
            h = Integer.parseInt(st.nextToken()); //높이
            if(w==0&&h==0) break;

            arr = new boolean[h][w];
            check = new boolean[h][w];

            for (int y = 0; y < h; y++) {
                st = new StringTokenizer(br.readLine());
                for (int x = 0; x < w; x++) {
                    int num = Integer.parseInt(st.nextToken());
                    if (num == 1)
                        arr[y][x] = true;
                }
            }
            int count=0;
            for(int y=0;y<h;y++){
                for(int x=0;x<w;x++){
                    if(arr[y][x] && !check[y][x]){
                        count++;
                        dfs(y,x);
                    }
                }
            }

            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int y, int x) {
        check[y][x] = true;

        for (int i = 0; i < 8; i++) {
            int nextY = y + dy[i];
            int nextX = x + dx[i];

            if (nextY >= 0 && nextY < h && nextX >= 0 && nextX < w &&
                    arr[nextY][nextX] && !check[nextY][nextX]) {
                dfs(nextY, nextX);
            }
        }
    }
}
