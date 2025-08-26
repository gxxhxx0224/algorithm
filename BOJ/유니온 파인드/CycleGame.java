import java.util.*;
import java.io.*;

//20040 G4 '사이클 게임'
class Main {
    static int parent[];

    static int find(int x) {
        if (x == parent[x]) return x;
        else return parent[x] = find(parent[x]);
    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x != y) {
            if (x < y) parent[y] = x;
            else parent[x] = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) parent[i] = i;

        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //이미 같은 집합이면 사이클 발생
            if(find(a)==find(b)){
                System.out.print(i);
                return;
            }
            //다른 집합이면 합치기
            else union(a,b);
        }
        System.out.print(0); //사이클 없음
    }
}
