import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSnBFS {
    static int n;
    static boolean graph[][], dfs_visit[],bfs_visit[];
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); //정점의 개수
        int m=Integer.parseInt(st.nextToken()); //간선의 개수
        int v=Integer.parseInt(st.nextToken()); //시작할 정점의 번호
        graph = new boolean[n + 1][n + 1];
        dfs_visit = new boolean[n + 1];
        bfs_visit = new boolean[n + 1];

        for(int i=1;i<=m;i++){
            st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            graph[a][b]=graph[b][a]=true;
        }
        dfs(v);
        sb.append("\n");
        bfs(v);

        System.out.print(sb);
    }

    public static void dfs(int start){
        dfs_visit[start]=true;
        sb.append(start+" ");

        for(int i=1;i<=n;i++){
            if(graph[start][i] && !dfs_visit[i]){
                dfs(i);
            }
        }
    }
    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        bfs_visit[start]=true;

        while(!q.isEmpty()){
            int x=q.poll();
            sb.append(x+" ");

            for(int i=1;i<=n;i++){
                if(graph[x][i] && !bfs_visit[i]){
                    q.add(i);
                    bfs_visit[i]=true;
                }
            }
        }
    }
}
