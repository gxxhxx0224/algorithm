import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int k=Integer.parseInt(br.readLine()); //합을 구할 부분의 수

        for(int count=0;count<k;count++){
            st=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken())-1;
            int j=Integer.parseInt(st.nextToken())-1;
            int x=Integer.parseInt(st.nextToken())-1;
            int y=Integer.parseInt(st.nextToken())-1;

            int sum=0;
            for(int col=i;col<=x;col++){
                for(int row=j;row<=y;row++){
                    sum+=arr[col][row];
                }
            }
            System.out.println(sum);
        }
    }
}
