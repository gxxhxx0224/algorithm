import java.util.*;

class MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        Map<String,Integer>map=new HashMap<>();
        
        for(int i=0;i<name.length;i++) map.put(name[i],yearning[i]);
        
        answer=new int[photo.length];
        
        for(int i=0;i<photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                if(map.get(photo[i][j])!=null) answer[i]+=map.get(photo[i][j]);
            }
        }
        
        return answer;
    }
}
