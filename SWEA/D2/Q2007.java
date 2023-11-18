import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2007 {
    static int n;
    static int arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            String str= br.readLine();
            int length=0;

            for(int i=1;i<=10;i++){
                if(str.substring(0,i).equals(str.substring(i,i+i))) {
                    length = i;
                    break;
                }
            }
            sb.append('#').append(tc).append(' ').append(length).append('\n');
        }
        System.out.print(sb);
    }
}
