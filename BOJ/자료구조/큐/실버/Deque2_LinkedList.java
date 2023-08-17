import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

//Deque_LinkedList를 이용한 구현
public class Deque2_LinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());

            switch (num){
                case 1:
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(!deque.isEmpty()){
                        sb.append(deque.pollFirst()).append("\n");
                        break;
                    }
                    sb.append(-1).append("\n");
                    break;
                case 4:
                    if(!deque.isEmpty()){
                        sb.append(deque.pollLast()).append("\n");
                        break;
                    }
                    sb.append(-1).append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    if(deque.isEmpty()) {
                        sb.append(1).append("\n");
                        break;
                    }
                    sb.append(0).append("\n");
                    break;
                case 7:
                    if(!deque.isEmpty()){
                        sb.append(deque.peekFirst()).append("\n");
                        break;
                    }
                    sb.append(-1).append("\n");
                    break;
                case 8:
                    if(!deque.isEmpty()){
                        sb.append(deque.peekLast()).append("\n");
                        break;
                    }
                    sb.append(-1).append("\n");
                    break;
            }
        }
        br.close();
        System.out.print(sb);
    }
}
