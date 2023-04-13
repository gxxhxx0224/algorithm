import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MilkFestival{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        br.close();

        int store[]=new int[n]; //우유 가게의 수

        int count=0; //영학이가 마신 우유 갯수
        int next=0; //영학이가 다음에 마실 우유

        for(int i=0;i<n;i++){
            store[i]=Integer.parseInt(st.nextToken());
            if(store[i]==next&&next==0){ //딸기우유일 경우
                next=1; //다음에 마실 우유는 초코우유
                count++;
            }
            else if(store[i]==next && next==1){ //초코우유일 경우
                next=2; //다음에 마실 우유는 바나나우유
                count++;
            }
            else if(store[i]==next&&next==2){ //바나나우유일 경우
                next=0; //다음에 마실 우유는 딸기우유
                count++;
            }
        }
        System.out.print(count);
    }
}