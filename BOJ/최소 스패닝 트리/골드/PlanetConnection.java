import java.util.*;
import java.io.*;

//16398 G4 '행성 연결'
//119100KB, 956ms
public class Main {
    static int n,parents[];
    static ArrayList<Edge>edges=new ArrayList<>();
    static class Edge implements Comparable<Edge>{
        int from,to,cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o){
            return Integer.compare(this.cost,o.cost);
        }
    }
    static void makeSet(){
        parents=new int[n+1];
        for(int i=1;i<=n;i++) parents[i]=i;
    }
    static int find(int x){
        if(parents[x]==x) return x;
        else return parents[x]=find(parents[x]);
    }
    static boolean union(int a,int b){
        a=find(a);
        b=find(b);

        if(a==b) return false;

        if(a<b) parents[b]=a;
        else parents[a]=b;

        return true;
    }
    static long solve(){
        Collections.sort(edges);
        makeSet();

        int count=0;
        long total=0L;
        for(Edge edge:edges){
            if(union(edge.from,edge.to)){
                total+=edge.cost;
                count++;

                if(count==n-1)break;
            }
        }
        return total;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());


        for(int i=1;i<=n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=1;j<=n;j++){
                int cost=Integer.parseInt(st.nextToken());

                if(cost>0 && i<j) //ij ji는 같은건데 괜히 중복돼서 꼬임
                    edges.add(new Edge(i,j,cost));
            }
        }
        System.out.print(solve());
    }
}
