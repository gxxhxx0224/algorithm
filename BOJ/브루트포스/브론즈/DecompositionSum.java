import java.io.*;

public class DecompositionSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int result=0;

        for(int i=0;i<n;i++){
            int num=i;
            int sum=0;  //갓 자릿수의 합이 들어갈 sum
            while(num!=0){
                sum+=num%10;    //각 자릿수(1의 자리~)
                num/=10;   
            }
            if(sum+i==n){   //생성자를 찾은 경우
                result=i;
                break;
            }
        }
        System.out.print(result);
    }
}
