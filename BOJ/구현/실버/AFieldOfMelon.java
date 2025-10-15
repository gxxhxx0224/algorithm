import java.util.*;
import java.io.*;

public class Main {
    static int k,arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); //참외 개수

        //큰 사각형을 구하는데  쓸 변의 길이들
        int maxX=0;
        int maxY=0;

        int xIdx=0;
        int yIdx=0;

        int lines[]=new int[6];

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());

            lines[i]=len;

            if(dir==1 || dir==2){ //동서 방향
                if(maxX<len){
                    maxX=len;
                    xIdx=(i+3)%6;
                }
            }else{
                if(maxY<len){
                    maxY=len;
                    yIdx=(i+3)%6;
                }
            }
        }
        //큰사각형 - 작은사각형
        int ans=(maxY*maxX)-(lines[yIdx]*lines[xIdx]);
        
        System.out.print(ans*k);
    }
}
