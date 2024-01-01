import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class guitar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 끊어진 기타줄 수
        int m = Integer.parseInt(st.nextToken()); // 기타줄 브랜즈 개수

        int packPrice = 1001;
        int pcsPrice = 1001;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            packPrice = Math.min(packPrice, Integer.parseInt(st.nextToken()));
            pcsPrice = Math.min(pcsPrice, Integer.parseInt(st.nextToken()));
        }

        int price = 0;

        if (n >= 6) {
            if(packPrice>pcsPrice*6) {
                price += n * pcsPrice;
                n=0;
            }
            else {
                price += (n / 6) * packPrice;
                n = (n % 6);
            }
        }
        if (n <= 6) {
            if(packPrice>pcsPrice*n) {
                price += n * pcsPrice;
            }
            else price+=packPrice;

        }
        System.out.println(price);
    }
}
