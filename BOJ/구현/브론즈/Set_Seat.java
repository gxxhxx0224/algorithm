import java.util.*;
import java.io.*;

public class Main {
    static int row, col, arr[][], num;
    static int dy[] = {1, 0, -1, 0}, dx[] = {0, 1, 0, -1};
    static boolean check[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        arr = new int[row][col];
        check = new boolean[row][col];

        num = 1;
        arr[0][0] = num++;
        check[0][0] = true;

        set(0, 0, 0);

        int client = Integer.parseInt(br.readLine());
        String ans = f(client);

        System.out.print(ans);
    }

    static String f(int client) {
        int ans[] = new int[2];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == client) {
                    ans[0] = i;
                    ans[1] = j;

                    return (ans[1]+1)+" "+(ans[0]+1);
                }
            }
        }
        return "0";
    }

    static void print() {
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void set(int y, int x, int d) {
        if (num == col * row + 1) {
            return;
        }

        int ny = y + dy[d];
        int nx = x + dx[d];

        if (ny >= 0 && ny < row && nx >= 0 && nx < col) {
            if (!check[ny][nx]) {
                check[ny][nx] = true;
                arr[ny][nx] = num++;
                set(ny, nx, d);
            } else set(y, x, (d + 1) % 4);
        } else set(y, x, (d + 1) % 4);

    }
}
