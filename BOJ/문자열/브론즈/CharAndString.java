import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharAndString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int n=Integer.parseInt(br.readLine());

        System.out.println(s.charAt(n-1));
    }
}
