import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactorization{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        br.close();
        int i=2;

        while(true){
            if(n==1) break;
            if(n%i==0){
                n=n/i;
                System.out.println(i);
            }
            if(n/i!=0 && n%i==0) i=2;
            else i++;
        }
    }
}
