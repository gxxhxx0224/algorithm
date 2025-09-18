import java.util.*;
import java.io.*;

//BOJ 1916 G5 '최소비용 구하기' - 1차원 boolean 배열을 활용한 중복간선 제거
public class Main {
    static ArrayList<Bus>buses[];
    static int dist[];
    static boolean check[];
    static class Bus implements Comparable<Bus>{
        int node,cost;

        Bus(int node,int cost){
            this.node=node;
            this.cost=cost;
        }

        @Override
        public int compareTo(Bus o){
            return Integer.compare(this.cost,o.cost);
        }
    }
    static void solve(int start){
        PriorityQueue<Bus>pq=new PriorityQueue<>();
        pq.add(new Bus(start,0));
        dist[start]=0;

        while(!pq.isEmpty()){
            Bus nowBus=pq.poll();
            int now=nowBus.node;
            int nowCost=nowBus.cost;

            if(!check[now]) {
                check[now]=true;

                for (Bus nextBus : buses[now]) {
                    int next = nextBus.node;
                    int nextCost = nextBus.cost;
                    int distance = nowCost + nextCost;

                    if (dist[next] > distance) {
                        dist[next] = distance;
                        pq.add(new Bus(next, distance));
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //도시의 개수
        int m=Integer.parseInt(br.readLine()); //버스의 개수
        buses=new ArrayList[n+1];
        for(int i=1;i<=n;i++)
            buses[i]=new ArrayList<>();

        dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        check=new boolean[n+1];

        StringTokenizer st;
        for(int i=1;i<=m;i++){
            st = new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int to=Integer.parseInt(st.nextToken());
            int cost=Integer.parseInt(st.nextToken());

            buses[start].add(new Bus(to,cost));
        }
        st=new StringTokenizer(br.readLine());
        int start=Integer.parseInt(st.nextToken());
        int to=Integer.parseInt(st.nextToken());

        solve(start);

        System.out.print(dist[to]);
    }
}
