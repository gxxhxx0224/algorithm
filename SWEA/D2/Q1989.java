import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine()); //#tc
        StringBuilder sb = new StringBuilder();

        for(int tc=1;tc<=T;tc++){
            String str= br.readLine(); //입력
            String reverse="";

            for(int i=str.length()-1;i>=0;i--)
                reverse+=str.charAt(i);

            int ans=0;

            if(reverse.equals(str))
                ans=1;
            
            sb.append('#').append(tc).append(' ').append(ans).append('\n');
        }
        System.out.print(sb);
    }
}
