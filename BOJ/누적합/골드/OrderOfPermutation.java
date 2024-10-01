import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OrderOfPermutation {
    static int n;
    static long k;
    static boolean check[];
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); //개수
        check = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int order = Integer.parseInt(st.nextToken()); // 1 or 2

        sb = new StringBuilder();

        if (order == 1) { //k번째 수열 반환
            k = Long.parseLong(st.nextToken()); //몇번째인지
            findPer();
        } else { //수열이 몇번짼지 반환
            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());

            k = 1L;
            findRank(arr);
            sb.append(k);
        }
        System.out.print(sb);
    }

    public static long factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }

    public static void findRank(int arr[]) {
        for (int i = 0; i < n; i++) {
            long length=factorial(n-i-1);
            for (int j = 1; j <= n; j++) {
                if (!check[j - 1]) {
                    if (arr[i] != j) {
                        k += length;
                    } else {
                        check[j - 1] = true;
                        break;
                    }
                }
            }
        }
    }

    public static void findPer() {
        for (int depth = 0; depth < n; depth++) { //자릿수
            long length = factorial(n - depth - 1);

            for (int i = 1; i <= n; i++) { //무슨 숫자로 시작하는지
                if (!check[i - 1]) {
                    if (k - length <= 0) {
                        sb.append(i).append(" ");
                        check[i - 1] = true;
                        break;
                    } else k -= length;
                }
            }
        }
    }
}
