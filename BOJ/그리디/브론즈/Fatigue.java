import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fatigue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken()); //시간당 쌓이는 피로도
        int B=Integer.parseInt(st.nextToken()); //시간당 처리할 수 있는 일의 양
        int C=Integer.parseInt(st.nextToken()); // 휴식시 감소하는 피로도
        int M=Integer.parseInt(st.nextToken()); //최대 피로도.

        int p=0; //피로도
        int sum=0; //전체 처리한 일의 양
        for(int time=1;time<=24;time++){
            if(A>M) break;

            if((p+A)<=M){ //일하기
                p+=A;
                sum+=B;
            }
            else{ //휴식하기
                p-=C;
                if(p<0) p=0;
            }
        }
        System.out.println(sum);
    }
}
