import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Queue{
    public static int queue[];
    public static int size=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine()); //주어지는 명령의 수
        queue = new int[n];

        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            String str=st.nextToken();

            switch (str){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }br.close();
        System.out.print(sb);
        
    }

    public static void push(int item){
        queue[size]=item;
        size++;
    }
    public static int pop(){
        if(size==0) return -1; //비었을 경우 -1

        int res = queue[0]; //가장 앞의 정수 빼고 출력
        queue[0]=0;
        size--;

        for(int i=1;i<queue.length;i++) {
            if (size != 0) { //빼고도 큐가 비지 않으면
                queue[i - 1] = queue[i]; //한칸씩 앞으로 땡겨준다
            }
        }
        return res;
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        if(size==0) return 1; //비었으면 1(TRUE)
        return 0;
    }

    public static int front(){
        if(size==0) return -1; //비었으면 -1

        return queue[0]; //맨 앞 출력
    }

    public static int back(){
        if(size==0) return -1; //비었으면 -1

        return queue[size - 1]; //맨 뒤 출력
    }
}
