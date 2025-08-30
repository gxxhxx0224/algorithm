import java.util.*;
import java.io.*;

//2630 S2 '색종이 만들기'
//메모리: 15712kb, 시간: 140ms
public class Main {
    static int n, arr[][];
    static int white,blue;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n][n];
        StringTokenizer st;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        white=blue=0;

        divide(0,0,n);

        System.out.println(white);
        System.out.println(blue);
    }
    public static void divide(int sy,int sx,int size){
        if(sameCheck(sy,sx,size)){
            if(arr[sy][sx]==0) white++;
            else blue++;
        }else{
            size/=2;

            divide(sy,sx+size,size); //1사분면
            divide(sy,sx,size); //2사분면
            divide(sy+size,sx,size); //3사분면
            divide(sy+size,sx+size,size); //4사분면
        }
    }

    public static boolean sameCheck(int sy,int sx,int size){
        int color=arr[sy][sx];

        for(int y=sy;y<sy+size;y++){
            for(int x=sx;x<sx+size;x++){
                if(color!=arr[y][x])
                    return false;
            }
        }
        return true;
    }
}
