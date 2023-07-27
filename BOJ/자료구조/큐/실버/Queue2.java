import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Queue2{
    public static int q[] = new int[2000000];
    public static int size=0;
    public static int front=0;
    public static int back=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //명령의 수
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
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
        q[back]=item;
        back++;
        size++;
    }
    public static int pop(){
        if(size==0) return -1;
        else{
            int res = q[front];
            q[front]=0;
            front++;
            size--;
            return res;
        }
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if(size==0) return 1;
        else return 0;
    }
    public static int front(){
        if(size==0) return -1;
        return q[front];
    }
    public static int back(){
        if(size==0) return -1;
        return q[back-1];
    }
}
