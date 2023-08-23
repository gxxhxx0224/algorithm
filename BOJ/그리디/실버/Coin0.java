import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //동전 종류
        int k=Integer.parseInt(st.nextToken()); //만들어야할 k원
        int coin[]=new int[n]; //동전을 담을 배열
        int count=0; //k원을 만드는데 필요한 동전갯수
        int sum=0; //금액의 합
        for(int i=0;i<n;i++) coin[i]=Integer.parseInt(br.readLine());
        br.close();

        for(int i=n-1;i>=0;i--){
            if(k==sum) break; //if가 앞에 오는게 시간 더 빠름
            while(coin[i]<=k) {
                sum += coin[i];
                k -= coin[i];
                count++;
            }
        }
        System.out.print(count);
    }
}
