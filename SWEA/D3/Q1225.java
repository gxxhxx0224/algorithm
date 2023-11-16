import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1225 {
    static LinkedList<Integer> q;
    static int minus;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int T = Integer.parseInt(br.readLine());
            q = new LinkedList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 8; i++)
                q.offer(Integer.parseInt(st.nextToken()));

            minus = 1;
            pw();

            sb.append('#').append(T).append(' ');

            for(int i=0;i<q.size();i++)
                sb.append(q.get(i)).append(' ');
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void pw() {

        while (true) {
            int x=q.pollFirst()-minus;
            minus++;

            if(minus>5)
                minus=1;

            if(x<=0) {
                q.offer(0);
                break;
            }
            else
                q.offer(x);
        }
    }
}
