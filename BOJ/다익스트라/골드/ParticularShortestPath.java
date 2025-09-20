import java.util.*;
import java.io.*;

public class Main {
    static int n,e;
    static ArrayList<Edge>edges[];
    static class Edge implements Comparable<Edge>{
        int node,cost;

        public Edge(int node,int cost){
            this.node=node;
            this.cost=cost;
        }

        @Override
        public int compareTo(Edge o){
            return Integer.compare(this.cost,o.cost);
        }
    }
    static int[] solve(int start){
        int dist[]=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);

        PriorityQueue<Edge>pq=new PriorityQueue<>();
        pq.add(new Edge(start,0));
        dist[start]=0;

        while(!pq.isEmpty()){
            Edge nowEdge=pq.poll();
            int now=nowEdge.node;
            int nowCost=nowEdge.cost;

            if(nowCost>dist[now]) continue;

            for(Edge nextEdge: edges[now]){
                int next=nextEdge.node;
                int nextCost=nextEdge.cost;
                int distance=nowCost+nextCost;

                if(dist[next]>distance){
                    dist[next]=distance;
                    pq.add(new Edge(next,distance));
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); //정점의 개수
        e=Integer.parseInt(st.nextToken()); //간선의 개수

        edges=new ArrayList[n+1];
        for(int i=1;i<=n;i++)
            edges[i]=new ArrayList<>();

        for(int i=0;i<e;i++){
            st=new StringTokenizer(br.readLine());
            int from=Integer.parseInt(st.nextToken());
            int to=Integer.parseInt(st.nextToken());
            int cost=Integer.parseInt(st.nextToken());

            edges[from].add(new Edge(to,cost));
            edges[to].add(new Edge(from,cost));
        }

        st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        int dist1[]=solve(1);
        int distA[]=solve(a);
        int distB[]=solve(b);

        long len1=(long)dist1[a]+distA[b]+distB[n];
        long len2=(long)dist1[b]+distB[a]+distA[n];

        long min=Math.min(len1,len2);

        if(min<Integer.MAX_VALUE)
            System.out.println(min);
        else System.out.println(-1);
    }
}
