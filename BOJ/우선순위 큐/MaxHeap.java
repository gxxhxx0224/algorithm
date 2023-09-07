import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MaxHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //연산의 개수

        //우선순위 큐는 기본:최소힙 이므로 Collections.reverseOrder()로 생성해 poll할때 최대값 나오게 한다.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb =new StringBuilder();

        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());

            if(num==0){ //0 입력시
                if(pq.isEmpty()) sb.append(0).append('\n'); //비었으면 0출력
                else sb.append(pq.poll()).append('\n'); //최대값 제거 및 출력
            } else pq.add(num); //수 입력
        }
        br.close();
        System.out.println(sb);
    }
}
