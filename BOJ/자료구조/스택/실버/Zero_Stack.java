import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//스택 클래스를 이용한 구현
public class Zero_Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());
        Stack<Integer>stack=new Stack<>();

        for(int i=0;i<k;i++){
            int n=Integer.parseInt(br.readLine());

            if(n!=0){
                stack.push(n);
            }
            else{
                stack.pop();
            }
        }
        int sum=0;

        while(!stack.isEmpty()) sum+=stack.pop();

        System.out.print(sum);
    }
}
