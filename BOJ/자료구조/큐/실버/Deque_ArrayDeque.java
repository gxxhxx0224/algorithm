import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Deque_ArrayDeque {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer>deque=new ArrayDeque<>();
        int n=Integer.parseInt(br.readLine()); //명령의 수
        StringBuilder sb =new StringBuilder();

        for(int i=0;i<n;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());

            switch(st.nextToken()){

                case "push_front":
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(deque.isEmpty()){
                        sb.append(-1).append('\n');
                        break;
                    }
                    else{
                        sb.append(deque.pollFirst()).append('\n');
                        break;
                    }
                case "pop_back":
                    if(deque.isEmpty()){
                        sb.append(-1).append('\n');
                        break;
                    }
                    else{
                        sb.append(deque.pollLast()).append('\n');
                        break;
                    }
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
                case "empty":
                    if(deque.isEmpty()){
                        sb.append(1).append('\n');
                        break;
                    }
                    else{
                        sb.append(0).append('\n');
                        break;
                    }
                case "front":
                    if(deque.isEmpty()){
                        sb.append(-1).append('\n');
                        break;
                    }
                    else{
                        sb.append(deque.peekFirst()).append('\n');
                        break;
                    }
                case "back":
                    if(deque.isEmpty()){
                        sb.append(-1).append('\n');
                        break;
                    }
                    else{
                        sb.append(deque.peekLast()).append('\n');
                        break;
                    }
            }
        }
        br.close();
        System.out.print(sb);
    }
}
