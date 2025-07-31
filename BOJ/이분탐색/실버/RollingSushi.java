import java.util.*;
import java.io.*;

//2531 회전초밥
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //접시의 수
        int d=Integer.parseInt(st.nextToken()); //초밥의 가짓수
        int k=Integer.parseInt(st.nextToken()); //연속해서 먹는 접시의 수
        int c=Integer.parseInt(st.nextToken()); //쿠폰번호
        int arr[]=new int[n];
        int check[]=new int[d+1];

        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine()); //레일에 올라와있는 접시들

        int sum=0; //몇개인지
        int max=0;
        for(int i=0;i<n+k-1;i++){
            if(check[arr[i%n]]==0){ //먹지 않은 접시라면
                check[arr[i%n]]++;
                sum++;
            }else
                check[arr[i%n]]++;

            if(i>=k-1){
//            	// 현재 윈도우의 실제 종류 수 계산
//                int current = sum;
                if(check[c]==0) {
                    sum++; // 쿠폰 초밥이 없으면 추가 (sum은 건드리지 않음)
                    check[c]++;
                }

                max=Math.max(max,sum);
                
                check[arr[(i+n-k+1)%n]]--;
                
                if(check[arr[(i+n-k+1)%n]]==0) //접시가 전부 빠져야
                	sum--; //개수 뻄
            }
        }
        System.out.print(max);
    }
}
