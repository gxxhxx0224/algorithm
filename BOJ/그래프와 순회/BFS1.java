import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BFS1{
    static ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
    static int check[]; //순서를 체크할 배열
    static int count; //순서
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken()); //정점의 수
        int edge = Integer.parseInt(st.nextToken()); //간선의 수
        int startVertex=Integer.parseInt(st.nextToken()); //시작정점

        check = new int[vertex + 1]; //chek의 크기=정점의 수 지만 인덱스 혼란 방지위해 +1

        for(int i=0;i<check.length;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<edge;i++){
            st=new StringTokenizer(br.readLine());
            int from=Integer.parseInt(st.nextToken());
            int to=Integer.parseInt(st.nextToken());
            
            //무방향 그래프이므로 양쪽에 정보 추가
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        for(int i=1;i<=vertex;i++){
            Collections.sort(graph.get(i));
        }
        count=1; //순서는 1부터 시작

        bfs(startVertex);
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<check.length;i++){
            sb.append(check[i]).append('\n');
        }
        System.out.print(sb);
    }
    public static void bfs(int vertex){
        Queue<Integer>q=new LinkedList<>();
        q.offer(vertex); //큐에 시작 노드번호 add
        check[vertex]=count; //시작 노드번호 방문처리

        while(!q.isEmpty()){
            int a=q.poll(); //현재 탐색을 하기 전 위치한 노드

            for(int i=0;i<graph.get(a).size();i++){
                int newVertex=graph.get(a).get(i);
                
                if(check[newVertex]==0) {
                    q.offer(newVertex);
                    check[newVertex] = ++count;
                }
            }
        }

    }
}
