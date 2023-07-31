import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//LinkedList를 이용한 구현

public class Queue2_LinkedList{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine()); //명령의 수
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    //poll은 가장 앞에 있는 요소를 삭제, 삭제할 원소 없을경우 예외아닌 null 반환
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(q.pop()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if(q.isEmpty()){
                        sb.append(1).append("\n");
                        break;
                    }
                    sb.append(0).append("\n");
                    break;
                case "front":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(q.peek()).append("\n");
                    break;
                case "back":
                    if(q.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(q.peekLast()).append("\n");
                    break;
            }
        }br.close();
        System.out.print(sb);
    }
}
