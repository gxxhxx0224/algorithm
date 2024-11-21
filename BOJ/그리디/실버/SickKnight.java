import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int ans=0;

        if(n==1) //n이 1이면 이동불가(시작지점만)
            ans=1;
        else if(n==2) //n이 2일땐, 2번 3번 방향으로만 움직일 수 있음.
            ans=Math.min(4,(m+1)/2); //절대 4방향 다 움직일 수 없어서 최댓값은 4
        else if(n>=3){ //m=7부터 4방향 다 이동가능
            //4방향 다 이동한 후에는 y값이 1씩 변하는 1,4번 이동을 반복
            if(m<7)
                ans=Math.min(4,m);
            else
                ans=m-2;
        }
        System.out.print(ans);
    }
}
