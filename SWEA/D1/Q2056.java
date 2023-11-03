import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Q2056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int dayLimit[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int tc = 0; tc < T; tc++) {
            int date = Integer.parseInt(br.readLine());

            int yyyy = date / 10000;
            int mm = (date / 100) % 100;
            int dd = date % 100;


            if (mm < 1 || mm > 12 && dd < 1 || dd > dayLimit[mm - 1]) {
                System.out.println("#"+(tc+1)+" "+-1);
            }
            else{
                System.out.printf("#"+(tc+1)+" %04d/%02d/%02d\n",yyyy,mm,dd);
            }
        }
        br.close();
    }
}
