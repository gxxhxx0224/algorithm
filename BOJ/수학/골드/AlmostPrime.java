import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a=Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());

        int limit=(int)Math.sqrt(b);
        boolean check[]=new boolean[limit+1];

        //소수체크
        for(int i=2;i*i<=limit;i++){ //i*i 오버플로우 방지
            for(int j=i*i;j<=limit;j+=i){
                if(!check[j]){
                    check[j]=true;
                }
            }
        }
        long ans=0L;

        for(int i=2;i<=limit;i++){
            if(!check[i]){
                for(long j=(long)i*i;j<=b;j*=i){
                    if(j>=a) ans++;

                    //오버플로우 방지
                    if(b/i<j) break;
                }
            }
        }
        System.out.println(ans);
    }
}
