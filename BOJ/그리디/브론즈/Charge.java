import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//그리디 알고리즘/브론즈2/5585 "거스름돈"
public class Charge{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int money=Integer.parseInt(br.readLine()); //타로가 지불할 돈
        br.close();
        int cash=1000-money; //잔돈
        int count=0; //동전의 개수

        while(cash!=0){
            if(cash>=500){
                cash-=500;
                count++;
            }
            else if(cash>=100){
                cash-=100;
                count++;
            }
            else if(cash>=50){
                cash-=50;
                count++;
            }
            else if(cash>=10){
                cash-=10;
                count++;
            }
            else if(cash>=5){
                cash-=5;
                count++;
            }
            else{
                cash-=1;
                count++;
            }
        }
        System.out.print(count);
    }
}
