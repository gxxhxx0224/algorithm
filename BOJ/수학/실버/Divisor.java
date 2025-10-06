import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken()); //분자
        int b=Integer.parseInt(st.nextToken()); //분모
        int n=Integer.parseInt(st.nextToken()); //소숫점 n번쨰 자리

        a%=b;

        for(int i=0;i<n-1;i++)
            a=a*10%b;

        int ans=a*10/b;

        System.out.print(ans);
    }
}
