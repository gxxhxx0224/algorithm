import java.util.*;
import java.io.*;

//1922 G4 '네트워크 연결'
public class Main {
    static int n,m,parents[];
    static ArrayList<Edge> edges;
    static void makeSet(){
        parents=new int[n+1];
        for(int i=1;i<=n;i++)
            parents[i]=i;
    }
    static int find(int x){
        if(parents[x]==x) return x;
        else return parents[x]=find(parents[x]);
    }
    static boolean union(int a,int b){
        a=find(a);
        b=find(b);

        if(a!=b){
            if(a<b) parents[b]=a;
            else parents[a]=b;
        }else return false;

        return true;
    }
    static int solve(){
        makeSet();
        Collections.sort(edges);

        int totalCost=0;
        int count=0;
        for(Edge now: edges){
            int from=now.from;
            int to=now.to;
            int cost=now.cost;

            if(union(from,to)){
                totalCost+=cost;
                count++;

                if(count==n-1) break;
            }
        }
        return totalCost;
    }
    static class Edge implements Comparable<Edge>{
        int from,to,cost;

        public Edge(int from,int to,int cost){
            this.from=from;
            this.to=to;
            this.cost=cost;
        }

        @Override
        public int compareTo(Edge o){
            return Integer.compare(this.cost,o.cost);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine()); //컴퓨터 수
        m=Integer.parseInt(br.readLine()); //연결선 수

        edges=new ArrayList<>();

        for(int i=1;i<=m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int cost=Integer.parseInt(st.nextToken());

            edges.add(new Edge(a,b,cost));
        }
        System.out.print(solve());
    }
}
