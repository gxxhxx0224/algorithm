import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class SnakeBird {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //과일의 개수
        int l=Integer.parseInt(st.nextToken()); //스네이크 버드의 초기길이

        int fruits[]=new int[n];
        st=new StringTokenizer(br.readLine());
        br.close();
        for(int i=0;i<n;i++) fruits[i]=Integer.parseInt(st.nextToken());

        Arrays.sort(fruits);

        for(int i=0;i<n;i++) {
            if(l>=fruits[i]) l++;
        }
        System.out.println(l);
    }
}
