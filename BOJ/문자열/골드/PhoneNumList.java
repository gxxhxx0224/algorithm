import java.util.*;
import java.io.*;

//substring
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1;tc<=t;tc++){
            int n=Integer.parseInt(br.readLine()); //전화번호의 수
            String num[]=new String[n];
            boolean yes=true;

            for(int i=0;i<n;i++) num[i]=br.readLine();

            Arrays.sort(num);

            for(int i=0;i<n-1;i++){
                if(num[i].length()<=num[i+1].length() &&
                num[i].substring(0,num[i].length()).equals(num[i+1].substring(0,num[i].length()))){
                    sb.append("NO\n");
                    yes=false;
                    break;
                }
            }
            if(yes) sb.append("YES\n");
        }
        System.out.print(sb);
    }
}
