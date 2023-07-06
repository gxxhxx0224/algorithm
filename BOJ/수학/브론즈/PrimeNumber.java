import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        br.close();

        int sum=0;
        int min=10001;

        for(int i=m;i<=n;i++){
            if(prime(i)==true){
                sum+=i;
                if(i<min){
                    min=i;
                }
            }
        }
        if(sum==0){
            System.out.println(-1);
        }
        else System.out.println(sum + "\n" + min);
    }
    public static boolean prime(int n){ //소수판별

        if(n==1) return false; //1은 소수가 아니므로

        for(int i=2;i<n;i++) { // i<=n 으로하면 죄다 false됨
            if(n%i==0) return false; //소수가 아님
        }
        return true;
    }
}
