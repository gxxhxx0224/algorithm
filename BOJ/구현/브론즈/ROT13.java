import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String input = br.readLine();
        
        for (char c : input.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                sb.append((char) ((c - 'a' + 13) % 26 + 'a'));
            } else if ('A' <= c && c <= 'Z') {
                sb.append((char) ((c - 'A' + 13) % 26 + 'A'));
            } else {
                sb.append(c);
            }
        }
        
        System.out.println(sb.toString());
    }
}
