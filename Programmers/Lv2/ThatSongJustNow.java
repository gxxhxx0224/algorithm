//내 코드
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        
        int max=0; //재생시 최대
        
        m=replace(m); //비교할 코드 #변환
        
        for(int t=0;t<musicinfos.length;t++){
            String arr[]=musicinfos[t].split(",");
            String scale=""; //실제 연주된 코드
            
            String start=arr[0];
            String end=arr[1];
            String title=arr[2];
            String code=replace(arr[3]); //코드진행 #변환
            
            int eh=Integer.parseInt(end.substring(0,2)); //끝 시간의 hh
            int sh=Integer.parseInt(start.substring(0,2)); //시작 시간의 hh 
            int em=Integer.parseInt(end.substring(3,5)); //끝 시간의 mm
            int sm=Integer.parseInt(start.substring(3,5)); //시작 시간의 mm
            
            int length=(eh-sh)*60 + (em-sm); //재생시간
            int count=0;
            
            //음악 길이보다 재생시간이 더 길경우, 처음부터 재생시간 만큼만 재생
            if(length>code.length()){
                count=length/code.length();
                
                for(int c=0;c<count;c++) scale+=code; //나눈 몫만큼 code 재생
                
                for(int c=0;c<length%code.length();c++){ //남은 재생시간만큼 끊기지 않고 처음부터 재생
                    scale+=code.charAt(c);
                }
            }else{ //재생시간이 더 짧으면 재생시간만큼만 추가
                for(int c=0;c<length;c++)
                    scale+=code.charAt(c);
            }
            
            if(scale.contains(m)){ //w조건과 일치하면
                if(max==0) //처음엔 제목 넣어주고
                    answer=title;
                else{ //이미 answer가 있다면
                    if(max<length) //재생시간 더 긴거로 갱신
                        answer=title;
                }
                max=Math.max(max,length);
                }
            }
        
        if(answer.isEmpty()) answer="(None)"; //조건이 일치하는 음악이 없으면 "(None)"
        
        return answer;
    }
    public static String replace(String str){
        str=str.replace("C#","H");
        str=str.replace("D#","I");
        str=str.replace("F#","J");  
        str=str.replace("G#","K");    
        str=str.replace("A#","L");
        str=str.replace("B#","M");
        return str;
    }
}
