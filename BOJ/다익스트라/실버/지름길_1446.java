import java.util.*;
import java.io.*;

//BOJ 1446 S1 '지름길'
public class Main {
    static int n, d, dists[];
    static boolean check[];
    static ArrayList<Edge>[] edges;
    static PriorityQueue<Edge> pq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //지름길의 개수
        d = Integer.parseInt(st.nextToken()); //고속도로 길이
        dists = new int[d + 1];
        Arrays.fill(dists, Integer.MAX_VALUE);

        check = new boolean[d + 1];
        edges = new ArrayList[d + 1];
        for (int i = 0; i <= d; i++)
            edges[i] = new ArrayList<>();

        //지름길
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());

            if (to <= d)
                edges[from].add(new Edge(to, dist));
        }

        //일반길
        for (int i = 0; i < d; i++) {
            edges[i].add(new Edge(i + 1, 1));
        }

        pq = new PriorityQueue<>();
        dijkstra();

        System.out.print(dists[d]);
    }

    static void dijkstra() {
        pq.add(new Edge(0, 0));
        dists[0] = 0;

        while (!pq.isEmpty()) {
            Edge a = pq.poll();
            int now = a.point;
            int cost = a.dist;

            if (now == d) break;
            if (check[now]) continue;
            check[now] = true;

            for (int i = 0; i < edges[now].size(); i++) {
                int next = edges[now].get(i).point;
                int nextCost = edges[now].get(i).dist + cost;

                if (dists[next] > nextCost && !check[next]) {
                    dists[next] = nextCost;
                    pq.add(new Edge(next, nextCost));
                }
            }
        }
    }

    static class Edge implements Comparable<Edge> {
        int point, dist;

        public Edge(int point, int dist) {
            this.point = point;
            this.dist = dist;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.dist, o.dist);
        }
    }
}
