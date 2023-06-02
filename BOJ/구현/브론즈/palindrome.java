import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        br.close();
        int ans=1;
        for(int i=0,j=s.length()-1;i<s.length();i++,j--){
            if(s.charAt(i)!=s.charAt(j)) ans=0;
        }
        System.out.print(ans);
    }
}
