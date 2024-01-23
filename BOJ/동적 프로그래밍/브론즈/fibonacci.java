import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci {
    public static int recursionCnt=0;
    public static int dynamicCnt=0;
    public static int arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        arr=new int[n];
        br.close();

        fibonacci_recursion(n);
        fibonacci_dynamic(n);
        System.out.print(recursionCnt+" "+dynamicCnt);
    }
    public static int fibonacci_recursion(int num){ //재귀호출
        if(num==1 || num==2) {
            recursionCnt++;
            return 1;
        }
        else return fibonacci_recursion(num-1)+fibonacci_recursion(num-2);
    }
    public static int fibonacci_dynamic(int num){ //동적 프로그래밍
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<num;i++){
            dynamicCnt++;
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[num-1];
    } 
}
