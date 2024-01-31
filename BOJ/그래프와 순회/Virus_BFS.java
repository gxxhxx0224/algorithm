import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//BFS
public class Main{
    static ArrayList<ArrayList<Integer>> computer = new ArrayList<>();
    static boolean check[]; //감염된 컴퓨터 체크 배열
    static int count; //1번에 의해 감염된 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //컴퓨터의 수
        int m = Integer.parseInt(br.readLine()); //직접 연결되어 있는 컴퓨터 쌍의 수

        check = new boolean[n + 1];

        for(int i=0;i<n+1;i++){
            computer.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int comA=Integer.parseInt(st.nextToken());
            int comB=Integer.parseInt(st.nextToken());

            computer.get(comA).add(comB);
            computer.get(comB).add(comA);
        }

        for (int i = 1; i < computer.size(); i++) Collections.sort(computer.get(i));

        count=0; //1번 컴퓨터를 통해 감염되는 수(1번 컴퓨터는 제외)
        bfs(1);
        System.out.print(count);
    }
    public static void bfs(int nowCom){
        Queue<Integer> q=new LinkedList<>();
        q.offer(nowCom);
        check[nowCom]=true;

        while(!q.isEmpty()){
            int x=q.poll();

            for(int i=0;i<computer.get(x).size();i++){
                int newCom=computer.get(x).get(i);

                if(check[newCom]==false){ //다음 컴이 감염되지 않았다면
                    q.offer(newCom);
                    check[newCom]=true;
                    count++;
                }
            }
        }
    }
}
