import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //학생 수
        int m=Integer.parseInt(st.nextToken()); //두학생 키 비교 횟수

        int dist[][]=new int[n+1][n+1];
        for(int[] d:dist)
            Arrays.fill(d,Integer.MAX_VALUE);

        boolean check[][]=new boolean[n+1][n+1];

        for(int i=1;i<=m;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken()); //더 작은 학생
            int b=Integer.parseInt(st.nextToken()); //더 큰 학생

            check[a][b]=true;
        }

        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(check[i][k] && check[k][j])
                        check[i][j]=true;
                }
            }
        }

        int ans=0;
        for(int i=1;i<=n;i++){
            int cnt=0;
            for(int j=1;j<=n;j++){
                if(check[i][j] || check[j][i])
                    cnt++;
            }
            if(cnt==n-1) ans++;
        }
        System.out.println(ans);
    }
}
