import java.io.*;
import java.util.*;

public class Main {
    static int m, n, parents[], totalCost;
    static ArrayList<Edge> edges;

    static void makeSet() {
        parents = new int[m + 1];

        for (int i = 1; i <= m; i++) parents[i] = i;
    }

    static int find(int x) {
        if (parents[x] == x) return x;
        else return parents[x] = find(parents[x]);
    }

    static boolean union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b) return false;

        if (a < b) parents[b] = a;
        else parents[a] = b;

        return true;
    }


    static class Edge implements Comparable<Edge> {
        int from, to, meter;

        public Edge(int from, int to, int meter) {
            this.from = from;
            this.to = to;
            this.meter = meter;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.meter, o.meter);
        }
    }

    static long solve() {
        Collections.sort(edges);
        makeSet();

        long total = 0L;
        int count = 0;
        for (Edge now : edges) {
            int from = now.from;
            int to = now.to;
            int meter = now.meter;

            if (union(from, to)) {
                total += meter;
                count++;

                if (count == m - 1) {
                    return total;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); //집의 수
            n = Integer.parseInt(st.nextToken()); //길의 수

            edges = new ArrayList<>();
            totalCost = 0;

            if (m == 0 && n == 0) break;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int meter = Integer.parseInt(st.nextToken());

                totalCost += meter;

                edges.add(new Edge(a, b, meter));
            }
            sb.append(totalCost - solve()).append("\n");
        }
        System.out.print(sb);
    }
}
