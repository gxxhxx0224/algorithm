import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//dfs
public class ConnectionElement_dfs {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int check[];
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        check = new int[n + 1];
        count = 0;

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= n; i++) {
            if (check[i] == 0) {
                count++;
                dfs(i);
            }
        }
        System.out.print(count);
    }

    public static void dfs(int start) {
        check[start] = count;

        for (int i = 0; i < graph.get(start).size(); i++) {
            int next = graph.get(start).get(i);

            if (check[next] == 0)
                bfs(next);
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = count;

        while (!q.isEmpty()) {
            int x = q.poll();

            for (int i = 0; i < graph.get(x).size(); i++) {
                int next = graph.get(x).get(i);

                if (check[next] == 0) {
                    q.add(next);
                    check[next] = count;
                }
            }
        }
    }
}
