import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class CardSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 카드 묶음 수
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<n;i++)
            pq.add(Integer.parseInt(br.readLine()));

        int ans=0;

        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();

            ans+=a+b;
            pq.add(a+b);
        }
        System.out.print(ans);
    }
}
