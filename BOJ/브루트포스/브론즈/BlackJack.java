import java.io.*;
import java.util.StringTokenizer;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   //카드의 개수
        int m = Integer.parseInt(st.nextToken());   //카드에 쓰여있는 수

        st = new StringTokenizer(br.readLine());
        br.close();
        //주어진 카드를 배열에 저장
        int card[]=new int[n];
        for(int i=0;i<n;i++) card[i] = Integer.parseInt(st.nextToken());

        int max=0;
        for(int i=0;i<n-2;i++){
            int sum=0;  //세 수의 합
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    sum=card[i]+card[j]+card[k];
                    if(sum<=m && sum>max) max=sum;
                }
            }
        }
        System.out.print(max);
    }
}

