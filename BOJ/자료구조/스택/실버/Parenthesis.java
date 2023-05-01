import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine()); //테스트 수

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<t;i++){
            String s=br.readLine();
            sb.append(solve(s)).append("\n");

        }br.close();

        System.out.println(sb);

    }
    public static String solve(String s){
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='(') stack.push(c); // '('일 경우 스택에 push

            else if(stack.empty()) return "NO"; //스택이 비었는데 ')'을 입력받아 pop할 원소가 없는데도 pop을 해야하는 경우

            else stack.pop(); //정상적으로 ')'인 경우 pop

        }
        if(stack.empty()) return "YES";

        else return "NO";
    }
}