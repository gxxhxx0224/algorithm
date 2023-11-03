import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        for (int i = 0; i < n; i++) num[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(num);

        System.out.print(num[n/2]);

    }
}
