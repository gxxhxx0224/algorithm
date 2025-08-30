import java.util.*;
import java.io.*;

//1780 S2 '종이의 개수'
public class Main {
    static int n,arr[][];
    static int mo,z,o;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n][n];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        divide(0,0,n);

        System.out.println(mo+"\n"+z+"\n"+o);
    }
    public static void divide(int sy,int sx,int size){
        if(isSame(sy,sx,size)){
            if(arr[sy][sx]==1) o++;
            else if(arr[sy][sx]==-1) mo++;
            else z++;
        }else{
            size/=3;

            divide(sy,sx,size);
            divide(sy,sx+size,size);
            divide(sy,sx+size*2,size);
            divide(sy+size,sx,size);
            divide(sy+size,sx+size,size);
            divide(sy+size,sx+size*2,size);
            divide(sy+size*2,sx,size);
            divide(sy+size*2,sx+size,size);
            divide(sy+size*2,sx+size*2,size);
        }
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
}
