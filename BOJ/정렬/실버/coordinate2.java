import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class coordinate2{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int xy[][]=new int[n][2];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken()); //x좌표
            xy[i][1] = Integer.parseInt(st.nextToken()); //y좌표
        }
        br.close();

        Arrays.sort(xy, (arr1, arr2) -> {
            if (arr1[1] == arr2[1]) {
                return arr1[0] - arr2[0];
            } else return arr1[1] - arr2[1];
        });
        for(int i=0;i<n;i++){
            System.out.println(xy[i][0] + " " + xy[i][1]);
        }
    }
}
