import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(factorial(n));
    }
    public static Long factorial(int n){
        if(n<=1) return 1L;
        else{
            return n * factorial(n - 1);
        }
    }
}
