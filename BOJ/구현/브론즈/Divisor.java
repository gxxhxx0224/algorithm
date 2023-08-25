import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisor{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int num[]=new int[n];
        int min=1000001;
        int max=0;
        br.close();


        for (int i = 0; i < n; i++) {
            num[i]=Integer.parseInt(st.nextToken());
            if(num[i]<min) min=num[i];
            if(num[i]>max) max=num[i];
        }
        System.out.print(min*max);

    }
}
