import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class Q1928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int tc=1;tc<=T;tc++){
            String input=br.readLine();
            String str= new String(Base64.getDecoder().decode(input));
            System.out.println("#"+tc+" "+str);
        }
        br.close();

    }
}
