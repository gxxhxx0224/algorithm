import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlphabet{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        String a[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count=0;

        for(int i=0;i<a.length;i++) {
            if(str.contains(a[i])) str = str.replace(a[i], "@");
        }
        System.out.println(str.length());
    }
}
