import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int time[]=new int[n];
        for(int i=0;i<n;i++){
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);

        int sum=0;
        int total=0;
        for(int i=0;i<n;i++){
            sum+=time[i];
            total+=sum;
        }
        System.out.print(total);
    }
}
