import java.io.*;

public class honeycomb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1, max = 1;
        br.close();
        if (n == 1) System.out.print(count);
        else if (n > 1) {
            while (max < n) {
                max += count * 6;
                count++;
            }
            System.out.print(count);
        }
    }
}
