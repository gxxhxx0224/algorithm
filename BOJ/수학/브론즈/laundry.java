import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//그리디 알고리즘
public class laundry{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine()); //테스트의 개수

        for(int i=0;i<t;i++){
            int c=Integer.parseInt(br.readLine()); //거스름돈 액수
            int coin[]=new int[4]; //각각의 동전이 담긴 배열
            //쿼터:$0.25,다임:$0.10,니켈:$0.05,페니:$0.01 순

            while(c!=0){
                if(c>=25){
                    c-=25;
                    coin[0]++;
                }
                else if(c>=10){
                    c-=10;
                    coin[1]++;
                }
                else if(c>=5){
                    c-=5;
                    coin[2]++;
                }
                else if(c>=1){
                    c-=1;
                    coin[3]++;
                }
            }
            System.out.println(coin[0]+" "+coin[1]+" "+coin[2]+" "+coin[3]);
        }br.close();
    }
}
