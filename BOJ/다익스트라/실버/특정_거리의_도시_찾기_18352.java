import java.util.*;
import java.io.*;

//BOJ 18352 S2 '특정 거리의 도시 찾기'
public class Solution {
    static int n,m,k,x;
    static int dists[];
    static boolean check[];
    static ArrayList<Edge>[] edges;
    static PriorityQueue<Edge>pq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); //도시 개수
        m=Integer.parseInt(st.nextToken()); //도로 개수
        k=Integer.parseInt(st.nextToken()); //거리
        x=Integer.parseInt(st.nextToken()); //출발 도시번호

        dists=new int[n+1];
        Arrays.fill(dists,Integer.MAX_VALUE);

        check=new boolean[n+1];
        pq=new PriorityQueue<>();
        edges=new ArrayList[n+1];
        for(int i=1;i<=n;i++)
            edges[i]=new ArrayList<>();

        for(int i=1;i<=m;i++){
            st=new StringTokenizer(br.readLine());

            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            edges[a].add(new Edge(b,1));
        }
        dijkstra();

        boolean ok=false;
        for(int i=1;i<=n;i++){
            if(dists[i]==k){
                System.out.println(i);
                ok=true;
            }
        }

        if(!ok) System.out.println(-1);

    }
    public static void dijkstra(){
        dists[x]=0;
        pq.add(new Edge(x,0));

        while(!pq.isEmpty()){
            Edge a=pq.poll();
            int now=a.point;
            int cost=a.cost;

            if(check[now]) continue;
            check[now]=true;

            for(int i=0;i<edges[now].size();i++){
                int next=edges[now].get(i).point;
                int nextCost=edges[now].get(i).cost+cost;

                if(dists[next]>nextCost && !check[next]){
                    dists[next]=nextCost;
                    pq.add(new Edge(next,dists[next]));
                }

            }

        }

    }
    static class Edge implements Comparable<Edge>{
        int point, cost;

        public Edge(int point, int cost) {
            this.point = point;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o){
            return Integer.compare(this.cost,o.cost);
        }
    }
}
