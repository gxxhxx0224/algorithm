import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //입국심사대 개수
        int line[]=new int[n];
        long m=Long.parseLong(st.nextToken()); //사람 수

        int max=0;
        for(int i=0;i<n;i++){
            line[i]=Integer.parseInt(br.readLine());
            max=Math.max(max,line[i]);
        }

        long low=1;
        long high=max*m; //최대시간 = 가장 늦는 심사대 * 인원수

        while(low<=high){
            long mid=(low+high)/2; //시간

            long sum=0; //수
            for(int i=0;i<n;i++){
                sum+=mid/line[i]; //시간안에 심사대별 몇명 응대 가능한지

                if(sum>=m) break;
            }

            if(sum>=m) high=mid-1;
            else low=mid+1;

        }
        System.out.print(low);
    }
}
