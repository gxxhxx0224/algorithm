import java.util.*;

class RunRace {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String,Integer>map=new HashMap<>();
        
        for(int i=0;i<players.length;i++) map.put(players[i],i);
        
        for(int i=0;i<callings.length;i++){
            String temp=callings[i]; //불린 선수의 이름
            int rank=map.get(temp); //이름 불린 선수의 등수
            
            if(rank-1>=0){
                map.replace(players[rank],rank-1);
                map.replace(players[rank-1],rank);
                
                players[rank]=players[rank-1];
                players[rank-1]=temp;
            }
            
        }
        
        return players;
    }
}
