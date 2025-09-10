import java.util.*;
import java.io.*;


//BOJ 1389 S1 '케빈 베이컨의 6단계 법칙'
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //유저 수
        int m = Integer.parseInt(st.nextToken()); //친구관계 수
        int arr[][] = new int[n + 1][n + 1];
        int dist[][] = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) dist[i][j] = 0;
                else if (arr[i][j] == 1) dist[i][j] = 1;
                else dist[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        int minBacon = Integer.MAX_VALUE;
        int ans=0;
        for (int i = 1; i <= n; i++) {
            int kevinBacon=0;
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                kevinBacon+=dist[i][j];
            }
            if(minBacon>kevinBacon){
                minBacon=kevinBacon;
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
