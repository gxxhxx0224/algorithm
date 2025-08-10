import java.util.*;
import java.io.*;

public class Main {
    static int n,m,count[];
    static List<List<Integer>>list=new ArrayList<>();
    static boolean check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        count=new int[n+1];

        for(int i=0;i<=n;i++)
            list.add(new ArrayList<>());

        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int to=Integer.parseInt(st.nextToken());
            int from=Integer.parseInt(st.nextToken());

            list.get(from).add(to);
        }

        for(int i=1;i<=n;i++) {
            check=new boolean[n+1];
            check[i]=true;
            bfs(i, i);
        }

        int max=0;
        for(int i=1;i<=n;i++)
            max=Math.max(max,count[i]);

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            if(max==count[i])
                sb.append(i).append(" ");
        }
        System.out.print(sb);
    }
    public static void bfs(int now,int start){
        Queue<Integer>q=new ArrayDeque<>();
        q.add(now);
        check[now]=true;

        while(!q.isEmpty()){
            now=q.poll();

            for(int next:list.get(now)){
                if(!check[next]){
                    check[next]=true;
                    q.add(next);
                    count[start]++;
                }
            }
        }
    }
    public static void dfs(int now,int start){ //시간초과
        for(int next:list.get(now)){
            if(!check[next]) {
                check[next]=true;
                count[start]++;
                dfs(next, start);
            }
        }
    }
}
