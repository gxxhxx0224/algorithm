import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //정렬하려는 수 N
        int[]count=new int[10]; //1,000,000,000 보다 작거나 같으므로 각자릿수 10개
        br.close();

        while(n!=0){
            count[n%10]++;
            n/=10;
        }
        for(int i=9;i>=0;i--){
            while(count[i]>0){
                System.out.print(i);
                count[i]--;
            }
        }

    }
}