import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stick {
    public static int stack[];
    public static int size=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //막대기의 개수
        stack=new int[n];

        for(int i=0;i<n;i++) push(Integer.parseInt(br.readLine()));
        br.close();

        int max=0; // <- 방향으로 셀 때 현재로서 가장 큰 막대기
        int count=0; //보이는 막대기의 갯수
        
        for(int i=n-1;i>=0;i--){ // <-방향으로 세므로 i--
            if(max<stack[i]){ //보이면 count++
                max=stack[i];
                count++;
            }
        }
        System.out.print(count);
    }

    public static void push(int item){
        stack[size]=item;
        size++;
    }
}
