import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1213 {
    static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int T=Integer.parseInt(br.readLine()); //테스트 케이스 넘버
            String search= br.readLine();
            str= br.readLine();

            int ans=check(search);

            sb.append('#').append(T).append(' ').append(ans).append('\n');
        }
        System.out.print(sb);
    }
    public static int check(String search){
        str=str.replace(search,"*");

        int count =0;

        for(int i=0;i<str.length();i++)
            if(str.charAt(i)=='*')
                count++;

        return count;
    }
}
