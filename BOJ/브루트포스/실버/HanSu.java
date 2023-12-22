import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanSu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        System.out.print(d(x));
    }

    public static int d(int n) {
        int ans = 0;

        if (n < 100)
            return n;
        else {
            ans = 99;
            int idx=100;
            while(idx<=n) {
                int hund = idx / 100;
                int ten = idx / 10 % 10;
                int one = idx % 10;

                idx++;

                if (hund - ten == ten - one)
                    ans++;
            }
            return ans;
        }
    }
}
