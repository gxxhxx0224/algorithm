import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2005 {
    static int n;
    static int arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n + 1][n + 1];

            triangle(n);

            sb.append('#').append(tc).append('\n');

            for(int i=1;i<=n;i++) {
                for (int j = 1; j <= i; j++)
                    sb.append(arr[i][j]).append(' ');
                sb.append('\n');
            }
        }
        System.out.print(sb);
    }

    public static void triangle(int num) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i<=2)
                    arr[i][j]=1;
                else
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
    }
}
