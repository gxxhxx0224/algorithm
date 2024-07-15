class JoyStick {
    public int solution(String name) {
        int answer = 0;
        int row=name.length()-1; //좌우 이동횟수(최악의 경우)
        
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            
            int col=c-'A'; //위아래 횟수
            
            if(col>13) col=26%col;
            
            answer+=col;
            
            int next=i+1;
            while(next<name.length() && name.charAt(next)=='A'){
                next++;
            }
            
            row=Math.min(row,Math.min(i*2+name.length()-next,(name.length()-next)*2+i));
        }
        answer+=row;
        return answer;
    }
}
