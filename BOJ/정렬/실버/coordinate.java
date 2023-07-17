import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class coordinate{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int xy[][]=new int[n][2];

        for(int i=0;i<n;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken()); //i번 점의 x위치
            xy[i][1] = Integer.parseInt(st.nextToken()); //i번 점의 y위치
        }
        br.close();

        Arrays.sort(xy, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else return e1[0] - e2[0];
        });
        for(int i=0;i<n;i++){
            System.out.println(xy[i][0] + " " + xy[i][1]);
        }

    }
}
