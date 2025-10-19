import java.util.*;
import java.io.*;

public class Main {
    static int arr[][],n;
    static int dy[]={1,0,-1,0},dx[]={0,1,0,-1};
    static boolean check[][];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());

        arr=new int[n][n];
        check=new boolean[n][n];

        arr[0][0]=n*n;
        check[0][0]=true;
        snail(n*n,0,0,0);

        StringBuilder sb = new StringBuilder();
        int num=Integer.parseInt(br.readLine());
        int y=0,x=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sb.append(arr[i][j]).append(" ");

                if(arr[i][j]==num){
                    y=i+1;
                    x=j+1;
                }
            }sb.append("\n");
        }

        sb.append(y+" "+x);

        System.out.println(sb);
    }
    public static void snail(int num,int y,int x,int d){
        if(num==1) return;

        int next=num-1;
        int ny=y+dy[d];
        int nx=x+dx[d];
        int nd=(d+1)%4;

        if(ny>=0 && ny<n && nx>=0 && nx<n) {
            if(!check[ny][nx]){
                check[ny][nx]=true;
                arr[ny][nx]=next;
                snail(next,ny,nx,d);
            }else snail(num,y,x,nd);
        }else snail(num,y,x,nd);
    }
}
