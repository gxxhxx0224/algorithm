import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class findPrimeNumber{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int count=0;

        for(int i=0;i<n;i++){
            if(prime(Integer.parseInt(st.nextToken()))==true) count++;
        }
        System.out.print(count);
    }
    public static boolean prime(int n){
        if(n==1){ //1은 소수가 아니므로
            return false;
        }
        else{ //n=2는 자연스레 for문을 검사하지 않게됨
            for(int i=2;i<n;i++){ //2~n-1 까지 중 나누어 떨어지는 약수가 있으면 소수 아님.
                if(n%i==0) return false;
            }
        }
        return true; //위 두 조건에 안걸리면 소수다.
    }
}
