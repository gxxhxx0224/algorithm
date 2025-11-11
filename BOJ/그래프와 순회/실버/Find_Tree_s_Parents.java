import java.io.*;
import java.util.*;

//11725 S2 '트리의 부모 찾기'
public class Main {
    static int n,arr[];
    static boolean check[];
    static ArrayList<Integer>list[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        arr=new int[n+1];
        check=new boolean[n+1];
        list=new ArrayList[n+1];

        for(int i=1;i<=n;i++)
            list[i]=new ArrayList<>();

        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        solve();

        StringBuilder sb = new StringBuilder();
        for(int i=2;i<=n;i++)
            sb.append(arr[i]).append("\n");

        System.out.print(sb);
    }
    static void solve(){
        Queue<Integer>q=new ArrayDeque<>();
        int now=1;
        q.add(now);
        check[1]=true;

        while(!q.isEmpty()) {
            now=q.poll();

            for (int next : list[now]) {
                if (now == 1 && !check[next]) {
                    arr[next] = now;
                    check[next] = true;
                    q.add(next);
                }else{
                    if(check[now] && !check[next]){
                        check[next]=true;
                        arr[next]=now;
                        q.add(next);
                    }
                }
            }
        }
    }
}
