import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s=Long.parseLong(br.readLine()); //n개의 자연수 합의 최댓값
        long sum=0,idx=1;
        int count=0;


        while(sum<s){
            sum+=idx;
            count++;
            idx++;
        }
        if(sum==s) System.out.print(count);
        else System.out.print(count-1);
    }
}
