import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int tc = 0; tc < T; tc++) {
            String[] numbers = br.readLine().split(" ");
            int sum = 0;
            
            for (String num : numbers) {
                sum += Integer.parseInt(num);
            }
            
            System.out.println(sum);
        }
    }
}
