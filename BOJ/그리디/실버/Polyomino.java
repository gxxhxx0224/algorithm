import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str.contains("XXXX"))
            str = str.replace("XXXX", "AAAA");
        if (str.contains("XX"))
            str = str.replace("XX", "BB");
        if (str.contains("X"))
            str = "-1";

        System.out.print(str);
    }
}
