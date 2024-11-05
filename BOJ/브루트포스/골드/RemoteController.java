import java.util.*;
import java.io.*;

//일반 브루트포스
public class Main{
    static boolean broken[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine()); //수빈이가 이동하려고 하는 채널
        int m=Integer.parseInt(br.readLine()); //고장난 버튼의 개수
        broken=new boolean[10]; //부서진 버튼 배열

        if(m>0) { //m이 0일 경우는 st 못받음
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++)
                broken[Integer.parseInt(st.nextToken())] = true; //부서진 버튼 체크
        }
        
        if(n==100){ //현재 채널인 100이면
            System.out.print(0); //안눌러도 됨
            return;
        }
        int count=Math.abs(n-100); //버튼 누르는 최소횟수(초기값은 최악의 경우인 n-100

        for(int i=0;i<=999999;i++){
            int click=clickNumber(i); //숫자버튼을 누르는 횟수

            if(click==0) continue; //못누르게 될 경우 다음 경우의 수로
            count=Math.min(count,Math.abs(n-i)+click); //+- 버튼횟수 + 숫자만 누르는 횟수
        }
        System.out.print(count);
    }
    public static int clickNumber(int num){ //숫자만 누르는 경우
        if(num==0){
            if(broken[num]) return 0;
            else return 1;
        }
        int count=0; //숫자 버튼 누르는 횟수
        while(num>0){
            if(broken[num%10]) return 0; //고장난 버튼이면 못누름
            count++;
            num/=10;
        }
        return count;
    }

}
