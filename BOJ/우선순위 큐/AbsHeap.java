import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AbsHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //연산의 개수
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num1=Math.abs(o1);
                int num2=Math.abs(o2);

                if(num1==num2) return o1-o2; //절대값 같으면
                else return num1-num2;
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());

            if(num==0){
                if(pq.isEmpty()) sb.append(0).append('\n');
                else sb.append(pq.poll()).append('\n');
            }
            else pq.offer(num);
        }
        br.close();
        System.out.print(sb);
    }
}
