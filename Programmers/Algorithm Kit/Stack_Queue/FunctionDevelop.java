import java.util.*;

class FunctionDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        int arr[]=new int[speeds.length]; //총 시간
        
        //총 걸리는 시간=(남은 퍼센트/속도)+ if(남은퍼센트%속도 !=0) ? +1:0
        for(int i=0;i<speeds.length;i++){
            int rest=100-progresses[i]; //남은 퍼센트
            arr[i]=rest/speeds[i];
            
            if(rest%speeds[i]!=0) arr[i]++;
        }
        
        List<Integer>list=new LinkedList<>();
        int prev=arr[0];
        int count=0;
        //예시1) 7,3,9
        //>=이면 count++
        
        for(int i=0;i<arr.length;i++){
            if(prev<arr[i]){
                prev=arr[i];
                list.add(count);
                count=1;
            }
            else{
                count++;
            }
        }
        if(count!=0) list.add(count);
        
        answer=new int[list.size()];
        for(int i=0;i<list.size();i++) answer[i]=list.get(i);
        
        return answer;
    }
}
