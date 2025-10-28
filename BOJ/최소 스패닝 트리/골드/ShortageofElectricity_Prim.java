import java.io.*;
import java.util.*;

//Prim
public class Main {
    static int m, n;
    static boolean check[];
    static ArrayList<Edge>edges[];
    static class Edge implements Comparable<Edge>{
        int to;
        long meter;

        public Edge(int to,long meter){
            this.to=to;
            this.meter=meter;
        }
        @Override
        public int compareTo(Edge o){
            return Long.compare(this.meter,o.meter);
        }
    }
    static long solve(){
        PriorityQueue<Edge>pq=new PriorityQueue<>();
        pq.add(new Edge(0,0));

        long total=0L;
        int count=0;

        while(!pq.isEmpty()){
            Edge now=pq.poll();
            int node=now.to;
            long nowMeter=now.meter;

            if(!check[node]){
                check[node]=true;
                total+=nowMeter;
                count++;

                if(count==m) break;

                for(Edge next:edges[node]){
                    int nextNode=next.to;
                    long nextMeter=next.meter;

                    if(!check[nextNode]){
                        pq.add(new Edge(nextNode,nextMeter));
                    }
                }
            }
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); //집의 수
            n = Integer.parseInt(st.nextToken()); //길의 수

            if(m==0 && n==0) break;

            check=new boolean[m];

            long total=0L;

            edges=new ArrayList[m];
            for(int i=0;i<m;i++){
                edges[i]=new ArrayList<>();
            }


            for(int i=0;i<n;i++){
                st=new StringTokenizer(br.readLine());
                int a=Integer.parseInt(st.nextToken());
                int b=Integer.parseInt(st.nextToken());
                int meter=Integer.parseInt(st.nextToken());

                total+=meter;
                edges[a].add(new Edge(b,meter));
                edges[b].add(new Edge(a,meter));

            }
            sb.append(total-solve()).append("\n");
        }
        System.out.print(sb);
    }
}
