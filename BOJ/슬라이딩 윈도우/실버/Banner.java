import java.io.*;
import java.util.*;

//27527 S1 '배너 걸기'- 슬라이딩 윈도우
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        int arr[]=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());


        int count[]=new int[1000001];
        int huddle=(int)Math.ceil(9.0*m/10.0);

        //첫 슬라이드
        boolean ok=false;
        for(int i=0;i<m;i++){
            count[arr[i]]++;

            if(count[arr[i]]>=huddle) ok=true;

            if(ok) {
                System.out.print("YES");
                return;
            }
        }

        //원형인지 선형인지 보자 제발 
        for(int i=1;i<=n-m;i++){
            count[arr[i-1]]--;
            count[arr[i+m-1]]++;

            if(count[arr[i+m-1]]>=huddle) {
                ok=true;
                break;
            }
        }

        String ans=ok?"YES":"NO";

        System.out.print(ans);
    }
}
