import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberBaseball {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //질문횟수
        boolean checkX[] = new boolean[988]; //될 수 없는 수.

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String num = st.nextToken();
            int s = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //입력된 수와 가능한 수 (123~987)와 비교
            for (int j = 123; j <= 987; j++) {
                if(checkX[j]) continue;

                String test = String.valueOf(j);
                int ns = 0;
                int nb = 0;

                //0이 들어가거나, 같은 수 들어가면 제외
                if (test.contains("0")) {
                    checkX[j] = true;
                    continue;
                }
                if (test.charAt(0) == test.charAt(1) ||
                        test.charAt(0) == test.charAt(2) || test.charAt(1) == test.charAt(2)) {
                    checkX[j] = true;
                    continue;
                }



                for (int first = 0; first < 3; first++) {
                    char aa = num.charAt(first);

                    for (int second = 0; second < 3; second++) {
                        char bb = test.charAt(second);

                        if (aa == bb) {
                            if (first == second) ns++;
                            else nb++;
                        }
                    }
                }
                if (s == ns && b == nb) {
                    checkX[j] = false;
                } else checkX[j] = true;
            }
        }
        int ans = 0;
        for (int i = 123; i <= 987; i++) {
            if (!checkX[i]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
