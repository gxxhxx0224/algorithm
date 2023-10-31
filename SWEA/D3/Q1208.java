import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1208{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int t=1;t<=10;t++) {
            int n = Integer.parseInt(br.readLine()); //덤프 횟수
            StringTokenizer st = new StringTokenizer(br.readLine());
            int list[] = new int[100];
            for (int i = 0; i < 100; i ++) list[i] = Integer.parseInt(st.nextToken());

            for(int i=0;i<n;i++){
                Arrays.sort(list);
                list[0]++;
                list[99]--;
            }
            Arrays.sort(list);
            int gap = list[99] - list[0];
            System.out.println("#"+t+" "+gap);
        }
    }
}
