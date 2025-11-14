import java.io.*;
import java.util.*;

//15565 S1 '귀여운 라이언'
public class Main {
    static int n,k,arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        arr=new int[n];

        List<Integer>list=new ArrayList<>();
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());

            if(arr[i]==1) list.add(i);
        }

        if(list.size()<k){
            System.out.print(-1);
            return;
        }

        //첫번째 슬라이드
        int length=list.get(k-1)-list.get(0)+1;

        if(list.size()>k){
            for(int i=1;i<=list.size()-k;i++){
                length=Math.min(length,list.get(i+k-1)-list.get(i)+1);
            }
        }
        System.out.print(length);
    }
}
