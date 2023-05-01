import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parenthesis{
    static int MAX=50;
    static boolean check=true;

    static String stack[]=new String [MAX];
    static int top;

    static void push(String item) {
        stack[top] = item;
        top++;
    }
    static void pop(){
        if(top>0) {
            top--;
            stack[top] = "";
        }
        else{
            check=false;
        }
    }
    static boolean isEmpty() {
        if(top==0) {
            return true;
        }
        return false;
    }
    static void clear(){
        if(top!=0){
            while(top==0){
                top--;
                stack[top]="";
            }
        }
    }

    public static void main(String[] args) throws IOException,ArrayIndexOutOfBoundsException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine()); //테스트의 개수

        for(int i=0;i<T;i++){
            String s=br.readLine(); //괄호입력
            top=0;
            //pop연산으로 top이 0밑으로 떨어질때 ArrayIndexOutOfBoundsException이 발생해서 boolean형 check 도입
            check=true;

            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='('){ // '('일경우 push
                    push("*");
                }
                else if(s.charAt(j)==')'){ //')' 일경우 pop
                    pop();
                }
            }
            if(isEmpty() && check==true) {
                System.out.println("YES"); //비었을경우 올바른 괄호 문자열일 경우
                clear();
            }

            else if(!isEmpty() || check==false){
                System.out.println("NO"); //올바른 괄호 문자열 아닐 경우
                clear();
            }
        } br.close();
    }
}