import java.util.*;
import java.io.*;

public class Solution {
    static int arr[][], papers[][], ry, rx;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int maxY = 0;
        int maxX = 0;

        papers = new int[n + 1][2];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            papers[i][0] = y;
            papers[i][1] = x;

            maxY = Math.max(maxY, y);
            maxX = Math.max(maxX, x);
        }

        ry = maxY + 10;
        rx = maxX + 10;

        arr = new int[ry+2][rx+2];

        for (int i = 1; i <= n; i++) {
            draw(papers[i][0], papers[i][1]);
        }

        int len = 0;
        for (int y = 1; y <= ry; y++) {
            for (int x = 1; x <= rx; x++) {
                if(arr[y][x]==1) {
                    if (arr[y - 1][x] == 0) len++;
                    if (arr[y + 1][x] == 0) len++;
                    if (arr[y][x - 1] == 0) len++;
                    if (arr[y][x + 1] == 0) len++;
                }
            }
        }
        System.out.println(len);
    }
    public static void draw(int sy, int sx) {
        for (int y = sy; y < sy + 10; y++) {
            for (int x = sx; x < sx + 10; x++) {
                arr[y][x] = 1;
            }
        }
    }
}
