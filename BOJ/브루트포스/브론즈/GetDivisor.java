import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class GetDivisor{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        br.close();
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
        int count=0;    //약수의 개수
        int result=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count==k){
                result=i;
                break;
            }
        }
        System.out.print(result);
    }
}
