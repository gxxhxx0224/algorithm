import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//15903 카드합체놀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //카드의 개수
        int m=Integer.parseInt(st.nextToken()); //몇번 합체하는지

        PriorityQueue<Long>pq=new PriorityQueue<>();
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            pq.add(Long.parseLong(st.nextToken()));

        while(m-->0){
            long a=pq.poll();
            long b=pq.poll();
            pq.add(a+b);
            pq.add(a+b);
        }

        long sum=0;
        for(int i=0;i<n;i++)
            sum+=pq.poll();

        System.out.print(sum);
    }
}
