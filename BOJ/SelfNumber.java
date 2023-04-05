import java.io.*;

public class SelfNumber {
    public static void main(String[] args) throws IOException {
        boolean chk[] = new boolean[10001];
        for(int i=1;i<=10001;i++){
            int n=d(i); //생성자가 있는 d(i)의 리턴값을 저장할 변수 n

            if(n<=10000) chk[n]=true; //생성자가 있는 수를 true, 만약 d(33)=39일 경우 chk[39]=true
        }
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<=10000;i++){
            if(!chk[i]){ //생성자가 없다면
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
        }
    public static int d(int n){
        int sum=n;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }return sum;
    }
    }

