import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//직접구현
public class Stack2 {
    public static int stack[];
    public static int size=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        stack=new int[n];
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());
            switch (num){
                case 1:
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    sb.append(pop()).append("\n");
                    break;
                case 3:
                    sb.append(size()).append("\n");
                    break;
                case 4:
                    sb.append(empty()).append("\n");
                    break;
                case 5:
                    sb.append(top()).append("\n");
                    break;
            }
        }br.close();
        System.out.print(sb);


    }
    public static void push(int item){
        stack[size]=item;
        size++;
    }
    public static int pop(){
        if(size==0) return -1;
        int res=stack[size-1];
        stack[size-1]=0;
        size--;
        return res;
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if(size==0) return 1;
        return 0;
    }
    public static int top(){
        if(size==0) return -1;
        return stack[size-1];
    }

}
