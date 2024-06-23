class Solution {
    public int No1_bandage(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int hp=health; //현재 체력
        int str=0; //치료 연속성공
        int end=attacks[attacks.length-1][0]; //마지막 피격시간
        
        for(int time=1;time<=end;time++){
            //몬스터 공격
            boolean atk=false;
            for(int i=0;i<attacks.length;i++){
                if(attacks[i][0]==time){
                    atk=true;
                    hp-=attacks[i][1]; //피해량만큼 hp감소
                    str=0; //연속성공 초기화
                    break;
                }
            }
            
            if(hp<=0) return -1;
            
            //공격 안당했으면, 힐
            if(!atk){
                hp+=bandage[1];
                ++str;
                
                if(str==bandage[0]){ //추가회복
                    hp+=bandage[2];
                    str=0; //연속성공 초기화
                }
                if(hp>=health){ //최대체력 넘을수 없음
                    hp=health;
                }
            }
        }
        answer=hp;
        return answer;
    }
}
