import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int sum=0;
            for(int j=0;j<10;j++){
                int num=Integer.parseInt(st.nextToken());

                if(num%2!=0) sum+=num;
            }
            System.out.println("#"+(i+1)+" "+sum);
        }br.close();
    }
}
