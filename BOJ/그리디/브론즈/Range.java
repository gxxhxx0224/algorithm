import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Range{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine()); //요리시간
        br.close();
        int btn[]=new int[3]; //버튼 A:5분(300s), B:1분(60s), C:10초를 저장할 배열

        while(t>0){
            if(t>=300){ //5분과 같거나 클 경우
                t-=300;
                btn[0]++; //버튼A +1회
            }
            else if(t>=60){ //1분과 같거나 클 경우
                t-=60;
                btn[1]++; //버튼B +1회
            }
            else if(t>=10){ //10초와 같거나 클 경우
                t-=10;
                btn[2]++; //버튼C +1회
            }
            else break;
        }
        if(t==0) { //시간이 맞아떨어진 경우
            System.out.print(btn[0]+" "+btn[1]+" "+btn[2]);
        }
        else System.out.print(-1); //세 버튼으로 T초를 못맞춘 경우

    }
}
