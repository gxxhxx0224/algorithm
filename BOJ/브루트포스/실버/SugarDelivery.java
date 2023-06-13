import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //배달해야할 설탕 무게
        int count=0; //봉지 수
        br.close();

        while(n>0){
            if(n%5==0){ //5로 나눠 떨어질 경우
                count+=n/5;
                break;
            }
            else{
                n-=3; //5로 나눠 떨어지지 않을 경우 -3kg;
                count++; //봉지수 +1
            }
            if(n<0) { //3kg 5kg 봉지로 나눠떨어지지 않는경우
                count=-1;
                break;
            }
        }
        System.out.print(count);
    }
}
