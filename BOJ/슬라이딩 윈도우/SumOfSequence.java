import java.util.*;
import java.io.*;

//1024 수열의 합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        for (int length = l; length <= 100; length++) {
            long sum = 0;
            long start=(n-length*(length-1)/2)/length;

            if(start>=0) {
                for (long i = start; i < start + length; i++) {
                    sum += i;
                }
                if (sum == n) {
                    for (int i = 0; i < length; i++)
                        sb.append((start+i) + " ");
                    System.out.print(sb);
                    return;
                }
            }
        }
        if(sb.length()==0) System.out.print(-1);
    }
}
