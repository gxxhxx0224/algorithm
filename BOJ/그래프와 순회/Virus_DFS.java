import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//DFS
public class Virus_DFS{
    static ArrayList<ArrayList<Integer>> computer = new ArrayList<>();
    static boolean check[]; //감염된 컴퓨터 체크 배열
    static int count; //1번에 의해 감염된 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //컴퓨터의 수
        int m = Integer.parseInt(br.readLine()); //직접 연결되어 있는 컴퓨터 쌍의 수

        check = new boolean[n + 1]; //인덱스 혼란 방지위해 +1

        for(int i=0;i<n+1;i++){
            computer.add(new ArrayList<>()); //인덱스 혼란 방지위해 +1까지 해줌
        }

        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            computer.get(from).add(to);
            computer.get(to).add(from);
        }

        for(int i=1;i<computer.size();i++){
            Collections.sort(computer.get(i));
        }

        count=0; //1번 컴퓨터를 통해 감염되는 컴퓨터의 수(1번 컴퓨터 미포함)
        dfs(1);
        System.out.print(count);

    }
    public static void dfs(int nowCom){
        check[nowCom]=true; //1번 컴퓨터(시작) 감염

        for(int i=0;i<computer.get(nowCom).size();i++){
            int newCom=computer.get(nowCom).get(i); //다음에 감염될 컴퓨터

            if(check[newCom]==false){ //다음에 방문할 컴퓨터가 감염되지 않은 컴퓨터일 경우
                check[newCom]=true;
                count++;
                dfs(newCom);
            }
        }
    }
}
