import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zerott{
    public static int stack[];
    public static int size=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine()); //정수의 갯수
        stack=new int[k];

        int sum=0;

        for(int i=0;i<k;i++){
            int n=Integer.parseInt(br.readLine());

            if(n!=0) push(n); //주어진 수가 0이 아니면 push
            else pop(); //0일 경우 가장 최근에 적은 수 뺌(pop)
        }br.close();

        for(int i=0;i<stack.length;i++) {
            sum += stack[i]; //최종적으로 남은 수의 합
        }
        System.out.print(sum);


    }

    public static void push(int item){
        stack[size]=item;
        size++;
    }
    public static void pop(){
        stack[size-1]=0;
        size--;
    }
}
