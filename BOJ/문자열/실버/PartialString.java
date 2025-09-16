import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String line=br.readLine();

            if(line==null) break;

            String str[]=line.split(" ");
            String s = str[0];
            String t = str[1];

            int idx=0;

            for(int i=0;i<t.length();i++){
                if(s.charAt(idx)==t.charAt(i)) idx++;

                if(idx==s.length()) {
                    System.out.println("Yes");
                    break;
                }
            }

            if(idx!=s.length()) System.out.println("No");

        }
    }
}
