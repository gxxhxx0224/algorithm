import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r=Integer.parseInt(st.nextToken()); //행
        int c=Integer.parseInt(st.nextToken()); //열
        int q=Integer.parseInt(st.nextToken()); //밝기 평균 알아볼 개수
        int prefix[][]=new int[r+1][c+1];

        for(int i=1;i<=r;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=c;j++){
                prefix[i][j]=prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1]+Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=q;i++){
            st=new StringTokenizer(br.readLine());
            int r1=Integer.parseInt(st.nextToken());
            int c1=Integer.parseInt(st.nextToken());
            int r2=Integer.parseInt(st.nextToken());
            int c2=Integer.parseInt(st.nextToken());

            long result=prefix[r2][c2]-prefix[r2][c1-1]-prefix[r1-1][c2]+prefix[r1-1][c1-1];
            int div=(r2-r1+1)*(c2-c1+1);

            result/=div;
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
