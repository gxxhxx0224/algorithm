import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1859 { //1859 백만장자 프로젝트 D2
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine()); //테스트 케이스의 수
        int price[];
        StringTokenizer st;

        for(int i=0;i<T;i++) {
            int n = Integer.parseInt(br.readLine()); //날의 수
            //가격 현황
            price = new int[n];
            st=new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++) {
                price[j]=Integer.parseInt(st.nextToken());
            }
            //2<=N<=백만,각 날의 매매가 는 <=10,000. 곱하면 천역->Long
            long profit=0; //이익
            
            //뒤에서부터 보자. -> 최대값에서 작은 값을 계속해서 빼주는 구조
            int max=0; //최대금액
            for(int j=n-1;j>=0;j--){
                int today=price[j]; //오늘금액

                if(max<=today) {
                    max=today;
                }
                else {//내 뒤로 최대값 있으면 무조건 구매. (이익=최대금액-오늘금액)
                    profit+=max-today;
                }
            }
            System.out.println("#"+(i+1)+" "+profit);
        }
        br.close();
    }
}
