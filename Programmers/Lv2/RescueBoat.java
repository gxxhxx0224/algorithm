import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        //정렬해서 맨뒤(제일 큰)것 + 맨앞(작은) 것 >=limit 이면 +1. 이후 최대값 앞으로 조정
        Arrays.sort(people);
        
        int maxIdx=people.length-1;
        int minIdx=0;
        
        while(minIdx<=maxIdx){
            if(people[maxIdx]+people[minIdx]<=limit) {
                answer++;
                maxIdx--;
                minIdx++;
            }
            else{
                maxIdx--;
                answer++;
            }
        }
        
        return answer;
    }
}
