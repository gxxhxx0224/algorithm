import java.util.*;
import java.io.*;

public class Main {
    static int n,m,parents[];
    static ArrayList<Road>roads;
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

        if(a!=b){
            if(a<b) parents[b]=a;
            else parents[a]=b;
        }else return false;
        return true;
    }
    static class Road implements Comparable<Road>{
        int from,to,cost;

        public Road(int from,int to, int cost){
            this.from=from;
            this.to=to;
            this.cost=cost;
        }

        @Override
        public int compareTo(Road o){
            return Integer.compare(this.cost,o.cost);
        }
    }
    static long solve(){
        makeSet();
        Collections.sort(roads);

        long totalCost=0;
        int cnt=0;
        int max=Integer.MIN_VALUE;
        for(Road now:roads){
            int from=now.from;
            int to=now.to;
            int cost=now.cost;

            if(union(from,to)){
                totalCost+=cost;
                cnt++;
                max=Math.max(max,cost);
                //모든 집을 최소비용으로 연결한 것 - 가장 비싼 간선 1개 제거
                //-> 트리가 2개의 컴포넌트로 분리됨=두개의 연결된 마을
                if(cnt==n-1) break; //n-2일때 break하면 안됨(n=2일때 안됨)
            }
        }
        return totalCost-max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); //집의 개수
        m=Integer.parseInt(st.nextToken()); //길의 개수
        roads=new ArrayList<>();

        for(int i=1;i<=m;i++){
            st = new StringTokenizer(br.readLine());

            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int cost=Integer.parseInt(st.nextToken());

            roads.add(new Road(a,b,cost));
        }
        System.out.print(solve());
    }
}
