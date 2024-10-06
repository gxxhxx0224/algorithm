import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

//17952 과제는 끝나지 않아
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //이번학기가 몇 분인지

        int ans=0; //총 점수
        Stack<int []>stack=new Stack<>();

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order=Integer.parseInt(st.nextToken());

            if(order==1){
                int score=Integer.parseInt(st.nextToken());
                int time=Integer.parseInt(st.nextToken())-1;
                stack.push(new int []{score,time});
            }else{
                if(!stack.isEmpty()) {
                    int a[] = stack.pop();
                    int time = a[1] - 1;
                    stack.push(new int[]{a[0], time});
                }
            }
            if(!stack.isEmpty() && stack.peek()[1]==0){
                ans+=stack.peek()[0];
                stack.pop();
            }
        }
        System.out.println(ans);
    }
}
