import java.io.*;
import java.util.*;

//Gold 4 9935 문자열 폭발
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            int count = 0; //길이체크

            stack.push(str.charAt(i));

            if(stack.size()>=bomb.length()) { //폭발문자열과 길이가 같거나 커지면
                boolean boom=true;
                for(int j=bomb.length()-1;j>=0;j--){ //str이 아닌 스택 기준 끝에서부터이므로 bomb.length()-1부터
                    //하나라도 다르면 터지지 않음
                    if(stack.get(stack.size()-1-j)!=bomb.charAt(bomb.length()-1-j)){
                        boom=false;
                        break;
                    }
                }
                if(boom){ //일치할 경우 폭발
                    for(int j=0;j<bomb.length();j++){
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<stack.size();i++)
            sb.append(stack.get(i));
        if(sb.length()==0) sb.append("FRULA");

        System.out.print(sb);
    }
}
