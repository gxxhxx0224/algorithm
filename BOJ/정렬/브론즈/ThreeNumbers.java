import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        br.close();
        int n[]=new int[3]; //세 정수가 들어갈 배열

        for(int i=0;i<3;i++){
            n[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(n); //오름차순 정렬
        System.out.print(n[1]); //두번째 큰 수 출력
    }
}