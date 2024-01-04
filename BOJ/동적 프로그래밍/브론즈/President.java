import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class President {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int tc=1;tc<=T;tc++){
            int k=Integer.parseInt(br.readLine()); //층
            int n=Integer.parseInt(br.readLine()); //호

            int arr[][]=new int[k+1][n+1];

            for(int i=1;i<=n;i++)
                arr[0][i]=i;

            for(int i=1;i<=k;i++){
                for (int j = 1; j <= n; j++)
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
            System.out.println(arr[k][n]);
        }
    }
}
