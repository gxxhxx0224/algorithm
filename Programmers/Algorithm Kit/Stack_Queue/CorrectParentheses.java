import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // '(': push
            
        // ')'
        //아무것도 없을경우 return false
        
        Stack<String>stack=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c=='(') stack.push("*");
            else{
                if(stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        if(!stack.isEmpty()) return false;
        
        return answer;
    }
}
