import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Tournament {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken()); //참가자 수
        int a=Integer.parseInt(st.nextToken()); //김지민 번호
        int b=Integer.parseInt(st.nextToken()); //임한수 번호

        int round=0;
        boolean check=false;
        while(n>=2){
            n=(n+1)/2;
            a=(a+1)/2;
            b=(b+1)/2;
            round++;

            if(a==b) {
                check=true;
                break;
            }
        }

        if(check) System.out.println(round);
        else System.out.println(-1);

    }
}
