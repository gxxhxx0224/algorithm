import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

//ArrayDeque를 이용한 구현
public class Card2_Deque_ArrayDeque{
    public static int size=0;
    public static int front=0;
    public static int back=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        br.close();

        for(int i=1;i<=n;i++) q.offer(i);

        while(q.size()>1){
            q.poll(); //제일 위에 있는 카드를 버린다

            //제일 위에 있는 카드를 제일 아래 있는 카드 밑으로 옮긴다.
            int temp=q.poll();
            q.offer(temp);
        }
        System.out.print((q.poll()));
    }
}
