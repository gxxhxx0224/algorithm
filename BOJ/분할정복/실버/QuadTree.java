import java.util.*;
import java.io.*;

//1992 S1 '쿼드트리'
//메모리: 14052kb, 시간: 100ms
public class Main {
    static int arr[][];
    static StringBuilder sb;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        arr=new int[n][n];

        for(int i=0;i<n;i++){
            String input=br.readLine();
            for(int j=0;j<n;j++){
                arr[i][j]=input.charAt(j)-'0';
            }
        }
        sb=new StringBuilder();

        divide(0,0,n);

        System.out.print(sb);
    }
    public static boolean isSame(int sy,int sx,int size){
        int color=arr[sy][sx];

        for(int y=sy;y<sy+size;y++){
            for(int x=sx;x<sx+size;x++){
                if(color!=arr[y][x]) return false;
            }
        }
        return true;
    }
    public static void divide(int sy,int sx,int size){
        if(isSame(sy,sx,size)){
            sb.append(arr[sy][sx]);
        }else{
            size/=2;

            sb.append('(');

            divide(sy,sx,size); //왼쪽 위
            divide(sy,sx+size,size); //오른쪽 위
            divide(sy+size,sx,size); //왼쪽 아래
            divide(sy+size,sx+size,size); //오른쪽 아래

            sb.append(')');
        }

    }
}
