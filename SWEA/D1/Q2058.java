import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2058 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int sum=0;

        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.print(sum);
    }
}
