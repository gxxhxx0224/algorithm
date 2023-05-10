import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gcd{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        int t=Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int d=gcd(a,b); //최대공약수

            System.out.println(a*b/d); //두 수의 곱을 최대공약수로 나눠 최소공배수를 구해준다.
        }br.close();
    }
    static int gcd(int a,int b){ //최대공약수 구하기
        while(b!=0){
            int r=a%b;

            a=b;
            b=r;
        }return a;
    }
}
