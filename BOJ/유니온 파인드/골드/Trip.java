import java.util.*;
import java.io.*;

//1976 G4 '여행 가자'
class Main {
    static int parent[],arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //도시의 수
        int m=Integer.parseInt(br.readLine()); //여행 계획에 속한 도시 수
        parent=new int[n+1];
        arr=new int[n][n];

        for(int i=1;i<=n;i++) parent[i]=i;

        StringTokenizer st;
        for(int i=1;i<=n;i++){
            st=new StringTokenizer(br.readLine());

            for(int j=1;j<=n;j++){
                int num=Integer.parseInt(st.nextToken());

                if(num==1) union(i,j);
            }
        }

        String ans="YES";
        st=new StringTokenizer(br.readLine());
        int start=find(Integer.parseInt(st.nextToken()));

        for(int i=0;i<m-1;i++){
            int now=find(Integer.parseInt(st.nextToken()));

            if(start!=now){
                ans="NO";
                break;
            }
        }
        System.out.print(ans);
    }
    public static int find(int x){
        if(x==parent[x]) return x;
        else return parent[x]=find(parent[x]);
    }
    public static void union(int x,int y){
        x=find(x);
        y=find(y);

        if(x!=y){
            if(x<y) parent[y]=x;
            else parent[x]=y;
        }
    }
}
