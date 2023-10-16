import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//Stack 클래스를 이용한 구현
public class Stack2_Class {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer>stack=new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());

            switch(num){
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.pop()).append("\n");
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if(stack.isEmpty()){
                        sb.append(1).append("\n");
                        break;
                    }
                    sb.append(0).append("\n");
                    break;
                case 5:
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.peek()).append("\n");
                    break;
            }
        }br.close();
        System.out.print(sb);
    }
}
