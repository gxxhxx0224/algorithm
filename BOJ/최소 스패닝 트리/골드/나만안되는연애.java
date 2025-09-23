import java.util.*;
import java.io.*;

//14621 G3 "나만 안되는 연애"
public class Main {
    static int n,m,parents[];
    static ArrayList<Univ>univs=new ArrayList<>();
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
    static class Univ implements Comparable<Univ>{
        int from,to,dist;

        public Univ(int from,int to,int dist){
            this.from=from;
            this.to=to;
            this.dist=dist;
        }

        @Override
        public int compareTo(Univ o){
            return Integer.compare(this.dist,o.dist);
        }
    }
    static int solve(){
        makeSet();
        Collections.sort(univs);

        int totalDist=0;
        int cnt=0;
        for(Univ univ:univs){
            int from=univ.from;
            int to=univ.to;
            int dist=univ.dist;

            if(union(from,to)) {
                totalDist += dist;
                cnt++;

                if (cnt == n - 1) break;
            }
        }
        if(cnt==n-1) return totalDist;
        else return -1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); //학교의 수
        m=Integer.parseInt(st.nextToken()); //도로 수

        st=new StringTokenizer(br.readLine());
        String gender[]=new String[n+1];
        for(int i=1;i<=n;i++)
            gender[i]=st.nextToken();

        for(int i=1;i<=m;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int dist=Integer.parseInt(st.nextToken());

            //남초-여초만 매칭
            if(!gender[a].equals(gender[b]))
                univs.add(new Univ(a,b,dist));
        }
        System.out.print(solve());
    }
}
