import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            boolean check = true;

            if (input.equals(".")) break;

            String before = "";
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else {
                        check = false;
                        break;
                    }
                } else if (c == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else {
                        check = false;
                        break;
                    }
                }
            }

            if(!check || !stack.isEmpty()) sb.append("no").append("\n");
            else sb.append("yes").append("\n");
        }
        System.out.println(sb);
    }
}
