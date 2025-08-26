import java.util.*;
import java.io.*;

//1717 G5 '집합의 표현'
class Main {
    static int parent[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        parent=new int[n+1];
        for(int i=1;i<=n;i++) parent[i]=i;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken()); //0:합침, 1: 포함됐는지 확인
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(order==0) union(a,b);
            else{
                if(check(a,b)) sb.append("YES\n");
                else sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
    public static int find(int x){
        if(x==parent[x]) return x;
        else return parent[x]=find(parent[x]); //이게 뭘 뜻하는거지?
    }
    public static void union(int x,int y){
        x=find(x);
        y=find(y);

        if(x!=y){ //여기도 뭔 뜻인지 잘 모르겠음
            if(x<y) parent[y]=x;
            else parent[x]=y;
        }
    }
    public static boolean check(int x,int y){
        x=find(x);
        y=find(y);

        if(x==y) return true;
        else return false;
    }
}
