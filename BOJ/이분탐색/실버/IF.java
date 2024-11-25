import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        String word[]=new String[n];
        int val[]=new int[n];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            word[i]=st.nextToken();
            val[i]=Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            int num=Integer.parseInt(br.readLine());

            int low=0;
            int high=n-1;

            while(low<=high){
                int mid=(low+high)/2;

                if(num>val[mid]) low=mid+1;
                else high=mid-1;
            }
            sb.append(word[low]+"\n");
        }
        System.out.print(sb);
    }
}
