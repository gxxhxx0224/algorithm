import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FractionSum{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(br.readLine());
        int d1 = Integer.parseInt(st.nextToken()); //첫번째 수의 분자
        int n1= Integer.parseInt(st.nextToken()); //첫번째 수의 분모

        st=new StringTokenizer(br.readLine());
        int d2 = Integer.parseInt(st.nextToken()); //두번째 수의 분자
        int n2= Integer.parseInt(st.nextToken()); //두번째 수의 분모

        int n=gcd(n1,n2); //두 분모의 최대공약수

        int N=n1*n2/n;  //최종분모
        int D=d1*(N/n1)+d2*(N/n2);    //최종 분자

        int d=gcd(D,N); //기약 분수를 만들기 위해 분자 분모의 최대공약수 구해준다


        System.out.print(D/d + " " + N/d);
    }
    public static int gcd(int a,int b){ //두 분모의 최소공배수를 구하기 위한 최대공약수 구하기
        while(b!=0){
            int r=a%b;

            a=b;
            b=r;
        }return a;
    }
}
