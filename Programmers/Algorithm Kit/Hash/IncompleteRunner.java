import java.util.*;

class IncompleteRunner {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //이름,개수
        Map<String,Integer>map=new HashMap<>();
        
        //전체 목록 +1
        for(int i=0;i<participant.length;i++){
            String name=participant[i];
            
            map.put(name,map.getOrDefault(name,0)+1);
        }
        
        //완주 -1
        for(int i=0;i<completion.length;i++){
            String name=completion[i];
            
            map.put(name,map.getOrDefault(name,0)-1);
        }
        
        for(String k: map.keySet()){
            int count=map.get(k);
            
            if(count!=0){
                answer=k;
                break;
            }
        }
        
        
        return answer;
    }
}
