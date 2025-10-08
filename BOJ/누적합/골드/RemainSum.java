import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        long sum=0L;
        long ans=0L;

        //나머지, 갯수
        Map<Long,Integer>map=new HashMap<>();
        map.put(0L,1); //나머지가 0: 나눠떨어짐

        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            sum=(sum+Integer.parseInt(st.nextToken()))%m;

            ans+=map.getOrDefault(sum,0);

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.print(ans);
    }
}
