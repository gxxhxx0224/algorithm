import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String stack[] = new String[100];
    public static int size=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String name=br.readLine();
            if(name == "stop") break;
            if(name!="르블랑"){
                if(size<7) push(name);
            }
            else{
                for(int i=0;i<size/2;i++) {
                    pop();
                }

            }
        }
        for(int i=size-1;i>=0;i--){
            System.out.println(peek(i));
        }
    }
    public static void push(String name){
        stack[size]=name;
        size++;
    }
    public static void pop(){
            stack[size - 1] = "";
            size--;
    }
    public static String peek(int i){
        return stack[i-1];
    }
}
