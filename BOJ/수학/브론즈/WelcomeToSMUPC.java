import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine().trim());

        String s = "WelcomeToSMUPC"; // 길이 14
        int idx = (int)((N - 1) % s.length());
        System.out.print(s.charAt(idx));
    }
}
