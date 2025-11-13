import java.io.*;
import java.util.*;

//11403 S1 '경로 찾기'
public class Main {
    static int n,arr[][];
    static ArrayList<Edge>edges[];
    static StringBuilder sb;
    static class Edge{
        int node;

        public Edge(int node){
            this.node=node;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n=Integer.parseInt(br.readLine());
        edges=new ArrayList[n];
        arr=new int[n][n];

        for(int i=0;i<n;i++)
            edges[i]=new ArrayList<>();

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++){
                int num=Integer.parseInt(st.nextToken());

                if(num==1) edges[i].add(new Edge(j));
            }
        }
        sb=new StringBuilder();

        for(int i=0;i<n;i++) solve(i);

        System.out.print(sb);
    }
    static void solve(int now){
        int first=0;

        boolean check[]=new boolean[n];
        Queue<Edge>q=new ArrayDeque<>();
        q.add(new Edge(now));

        while(!q.isEmpty()) {
            Edge nowNode=q.poll();
            now=nowNode.node;

            if(first--<0)
                check[now]=true;

            for (Edge nextNode : edges[now]) {
                int next = nextNode.node;

                if(!check[next]){
                    q.add(new Edge(next));
                }
            }
        }

        for(int i=0;i<n;i++){
            if(check[i]) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }sb.append("\n");
    }
}
