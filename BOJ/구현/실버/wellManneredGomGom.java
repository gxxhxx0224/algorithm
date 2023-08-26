import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class wellManneredGomGom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        int sum=0;
        for(int i=0;i<n;i++){
            String str= br.readLine();

            if(str.equals("ENTER")) {
                sum += hs.size();
                hs.clear();
            }
            else hs.add(str);

        }
        System.out.print(sum + hs.size());


    }
}
