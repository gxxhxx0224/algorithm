import java.util.*;
import java.io.*;

//5972 G5 '택배 배송'
//41772KB, 412ms
public class Main {
    static int n,m;
    static ArrayList<Edge> edges[];
    static class Edge implements Comparable<Edge>{
        int node, cost;
        public Edge(int node,int cost){
            this.node=node;
            this.cost=cost;
        }

        @Override
        public int compareTo(Edge o){
            return Integer.compare(this.cost,o.cost);
        }
    }
    static int solve(){
        int dist[]=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);

        boolean []check=new boolean[n+1];


        PriorityQueue<Edge>pq=new PriorityQueue<>();
        pq.add(new Edge(1,0));
        dist[1]=0;

        while(!pq.isEmpty()){
            Edge now=pq.poll();
            int nowNode=now.node;
            int nowCost=now.cost;

            if(!check[nowNode]){
                check[nowNode]=true;

                for(Edge next: edges[nowNode]){
                    int nextNode=next.node;
                    int nextCost=next.cost;
                    int nc=nowCost+nextCost;

                    if(!check[nextNode] && dist[nextNode]>nc){
                        pq.add(new Edge(nextNode,nc));
                        dist[nextNode]=nc;
                    }
                }
            }
        }

        return dist[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); //헛간 개수
        m=Integer.parseInt(st.nextToken()); //소들의 길 개수
        edges=new ArrayList[n+1];
        for(int i=1;i<=n;i++)
            edges[i]=new ArrayList<>();

        for(int i=1;i<=m;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int cost=Integer.parseInt(st.nextToken());

            edges[a].add(new Edge(b,cost));
            edges[b].add(new Edge(a,cost));
        }

        System.out.print(solve());
    }
}
