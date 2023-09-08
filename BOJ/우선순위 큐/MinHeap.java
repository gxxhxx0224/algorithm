import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinHeap {
    static int n;
    static int num[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //연산의 개수
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //오름차순이므로 그대로
        StringBuilder sb =new StringBuilder();

        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());

            if(num==0){
                if(pq.isEmpty()) sb.append(0).append('\n');
                else sb.append(pq.poll()).append('\n');
            } else pq.offer(num);
        }br.close();
        System.out.print(sb);
    }
}
