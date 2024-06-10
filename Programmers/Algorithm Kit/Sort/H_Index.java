import java.util.*;

class H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i=0;i<citations.length;i++){
            int num=citations[i];
            int cnt=citations.length-i;
            
            if(cnt<=num){
                answer=cnt;
                break;
            }
                
        }
        
        return answer;
    }
}
