import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[0];
        int n = 0;
        int m = 0;


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = 0;

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            arr = new int[n];
            

            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(br.readLine());
            Arrays.sort(arr);

            for (int i = 0; i < m; i++) {
                int num = Integer.parseInt(br.readLine());

                int low = 0;
                int high = n - 1;

                while (low <= high) {
                    int mid = (low + high) / 2;

                    if (arr[mid] > num) high = mid - 1;
                    else if (arr[mid] < num) low = mid + 1;
                    else {
                        ans++;
                        break;
                    }
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
