import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Hanjo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //활잡이, 봉우리의 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mountain[]=new int[n];
        for(int i=0;i<n;i++) mountain[i]=Integer.parseInt(st.nextToken());
        br.close();

        int count;
        int max=0;
        for(int i=0;i<n-1;i++){
            count=0;
            for(int j=i+1;j<n;j++){
                if(mountain[i]>mountain[j]) count++;
                else break;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);

    }
    
}
