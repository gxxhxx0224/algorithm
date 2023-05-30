import java.io.*;

public class president {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int arr[][] = new int[15][15];

        for (int i = 0; i < 15; i++) arr[0][i] = i + 1;

        for (int i = 1; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                int k = 0;
                while (k <= j) {
                    arr[i][j] += arr[i - 1][k];
                    k++;
                }
            }
        }
        for(int i=0;i<t;i++){
            int k=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());
            System.out.println(arr[k][n-1]);
        }br.close();

    }
}
