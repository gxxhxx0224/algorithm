import java.util.*;

class Solution {
    public String solution(String input_string) {
        String answer = "";
        boolean check[]=new boolean[26];
        boolean next[]=new boolean[26]; //두개 이상의 덩어리인지(떨어졌는지 여부)
        List<Character>list=new ArrayList<>();
        
        char prev;
        for(int from=0;from<input_string.length();from++){
            char c=input_string.charAt(from);
            
            if(from>0) {
                prev=input_string.charAt(from-1);
            
            if(c!=prev) 
                next[prev-'a']=true; //떨어진 것
                       }
            
            if(!check[c-'a']){
                check[c-'a']=true;
            }else{
                if(next[c-'a']){
                    list.add(c);
                }
            }
        }
        boolean ans[]=new boolean[26];
        
        for(int i=0;i<list.size();i++){
            char c=list.get(i);
            
            if(!ans[c-'a'])
                ans[c-'a']=true;    
        }
        for(int i=0;i<26;i++){
            if(ans[i]){
                answer+=String.valueOf((char)(i+'a'));
            }
        }
        if(answer.equals("")) answer="N";
    
        return answer;
    }
}
