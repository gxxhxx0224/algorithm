import java.util.*;
import java.io.*;

public class Main {
    static int n,m;
    static List<List<Integer>>list=new ArrayList<>();
    static boolean check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine()); //동기의 수
        m=Integer.parseInt(br.readLine()); //리스트 길이
        check=new boolean[n+1];

        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from=Integer.parseInt(st.nextToken());
            int to=Integer.parseInt(st.nextToken());

            list.get(from).add(to);
            list.get(to).add(from);
        }

        dfs(1,1);

        int ans=-1; //1:자신은 포함하지 않으므로 -1부터
        for(boolean t:check){
            if(t)
                ans++;
        }

        System.out.print(ans==-1?0:ans);
    }
    public static void dfs(int depth,int now){
        if(depth>=3)
            return;

        for(int next:list.get(now)){
            check[next]=true;
            dfs(depth+1,next);
        }
    }
}
