import java.util.*;

public class HateSameNumber {
    public int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer>stack=new Stack<>();
        
        int prev=1000001;
        for(int i=arr.length-1;i>=0;i--){
            if(prev!=arr[i]) stack.push(arr[i]);
            prev=arr[i];
        }
        
        int length=stack.size();
        answer=new int[length];
        for(int i=0;i<length;i++)
            answer[i]=stack.pop();
        
        return answer;
    }
}
