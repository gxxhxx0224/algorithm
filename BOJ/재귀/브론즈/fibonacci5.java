import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        br.close();
        System.out.print(fibonacci(n));
    }
    //for문을 이용한 피보나치.
    static int fibonacci(int n){
        if(n<=1) return n;
        int fibo[]=new int[n+1]; //n까지의 수를 나타내야 하므로 n+1크기의 배열
        fibo[0]=0;
        fibo[1]=1;
        int ans=0;  //n번째 피보나치 수를 저장하기 위한 변수
        for(int i=2;i<=n;i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            if(n==i) ans=fibo[i];
        }return ans;
    }
}
