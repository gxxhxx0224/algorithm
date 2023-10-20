import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Camping {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int i=1;

        while(true){
            st=new StringTokenizer(br.readLine());
            int L=Integer.parseInt(st.nextToken()); //캠핑장 사용가능 일수
            int P=Integer.parseInt(st.nextToken()); //연속하는 일수
            int V=Integer.parseInt(st.nextToken()); //휴가 일수

            if (L == 0 && P == 0 && V == 0) break;

            int total=0;

            while(V>P){ //연속하는 일수동안 캠핑장 사용가능한 일수의 합 구하기
                V-=P;
                total+=L;
            }

            if(V>=L) total+=L; //남은 휴가 일수가 사용가능 일수보다 크거나 같으면 사용가능 일수 추가
            else total+=V; //남은 휴가 일수가 사용가능 일수보다 작으면 남은 일수 추가

            System.out.println("Case "+i+": "+total);
            i++;
        }br.close();
    }
}
