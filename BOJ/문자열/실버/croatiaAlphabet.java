import java.io.*;

public class croatiaAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = {"c=", "c-","dz=","d-","lj","nj","s=","z="};

        String s=br.readLine();
        br.close();

        for(int i=0;i<str.length;i++) {
            if (s.contains(str[i])) {
                s = s.replace(str[i], "@");
            }
        }
        System.out.print(s.length());
        }
}
