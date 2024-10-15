import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n=Integer.parseInt(br.readLine()); //수의 개수
        int arr[]=new int[n];
        int sum=0;
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];

            if(mx<arr[i]) mx=arr[i];
            if(mn>arr[i]) mn=arr[i];
        }
        //산술평균
        sb.append(Math.round((double)sum/n)).append("\n");


        Arrays.sort(arr);
        sb.append(arr[n/2]).append("\n"); //중앙값

        int count[]=new int[8002];

        for(int i=0;i<n;i++){
            count[arr[i]+4000]++;
        }
        int max=0;
        for(int i=0;i<8002;i++){
            if(count[i]>max){
                max=count[i];
            }
        }

        boolean check[]=new boolean[8002];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(count[arr[i]+4000]==max && !check[arr[i]+4000]){
                pq.add(arr[i]);
                check[arr[i]+4000]=true;
            }
        }

        //최빈값 출력
        if(pq.size()==1) sb.append(pq.poll()).append("\n");
        else {
            pq.poll();
            sb.append(pq.poll()).append("\n");
        }

        sb.append(mx-mn).append("\n"); //범위

        System.out.print(sb);
    }
}
