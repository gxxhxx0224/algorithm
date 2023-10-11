import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class DFS2 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int check[];
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int vertex=Integer.parseInt(st.nextToken()); //정점의 수
        int edge=Integer.parseInt(st.nextToken()); //간선의 수
        int startVertex=Integer.parseInt(st.nextToken()); //시작정점

        check = new int[vertex + 1];

        for(int i=0;i<vertex+1;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<edge;i++){
            st=new StringTokenizer(br.readLine());
            int from=Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        count=1;

        for(int i=1;i<graph.size();i++){
            graph.get(i).sort(Collections.reverseOrder());
        }
        StringBuilder sb = new StringBuilder();
        dfs(startVertex);

        for(int i=1;i<check.length;i++){
            sb.append(check[i]).append('\n');
        }
        System.out.println(sb);
    }

    public static void dfs(int vertex){
        check[vertex]=count;

        for(int i=0;i<graph.get(vertex).size();i++){
            int newVertex=graph.get(vertex).get(i);

            if(check[newVertex]==0){
                count++;
                dfs(newVertex);
            }
        }
    }
}
