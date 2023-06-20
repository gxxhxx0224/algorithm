import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack=new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n=Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch(str){
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(stack.isEmpty()) {
                        sb.append(-1).append("\n");
                        break;
                    }else {
                        sb.append(stack.pop()).append("\n");
                        break;
                    }
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        sb.append(1).append("\n");
                        break;
                    }
                    else{
                        sb.append(0).append("\n");
                        break;
                    }
                case "top":
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                        break;
                    }
                    else {
                        sb.append(stack.peek()).append("\n");
                        break;
                    }
            }
        }br.close();
        System.out.print(sb);

    }
}
