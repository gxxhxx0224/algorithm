import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x=Long.parseLong(st.nextToken()); //게임횟수
        long y=Long.parseLong(st.nextToken()); //이긴게임 수

        long z=f(x,y);

        if(z>=99) {
            System.out.println(-1);
            return;
        }

        long low=1;
        long high=1000000000;

        while(low<=high){
            long mid=(low+high)/2;

            if(f(x+mid,y+mid)>z) high=mid-1;
            else low=mid+1;
        }
        System.out.print(low);
    }
    public static long f(long x,long y){
        return y*100/x;
    }
}
