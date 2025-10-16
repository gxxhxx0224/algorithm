import java.io.*;

public class Main {
    static int n, count[];
    static String word;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        word = br.readLine();
        count = new int[26];


        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            count[c - 'A']++;
        }

        int ans = 0;
        for (int i = 1; i <= n - 1; i++) {
            String s = br.readLine();
            boolean cnt = solve(s);

            if (cnt) ans++;
        }
        System.out.print(ans);
    }

    public static boolean solve(String s) {
        int cnt[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (count[c - 'A'] > 0)
                cnt[c - 'A']++;
            else cnt[c - 'A']--;
        }

        int diff = 0;
        boolean allow = true;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] < 0) {
                if (allow) allow = false;
                else return false;
            }
            diff += Math.abs(count[i] - cnt[i]);
        }
        if (diff <= 1 || (word.length() == s.length() && diff == 2)) return true;

        return false;
    }
}
