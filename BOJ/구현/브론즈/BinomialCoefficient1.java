import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomialCoefficient1{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        br.close();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        //이항계수 n,k는 n!/k!(n-k)! 이므로
        System.out.print(factorial(n) / (factorial(k) * factorial(n - k)));

    }
    public static int factorial(int n){
        if(n<=1) return 1;
        else return n*factorial(n-1);
    }
}
