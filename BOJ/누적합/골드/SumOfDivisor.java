import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int max=1000000;

        long f[]=new long[max+1];
        long prefix[]=new long[max+1];

        for(int i=1;i<=max;i++){
            for(int j=i;j<=max;j+=i){
                f[j]+=i;
            }
        }

        for(int i=1;i<=max;i++){
            prefix[i]=prefix[i-1]+f[i];
        }

        StringBuilder sb = new StringBuilder();
        for(int tc=1;tc<=t;tc++){
            int num=Integer.parseInt(br.readLine());
            sb.append(prefix[num]).append("\n");
        }
        System.out.print(sb);
    }
}
