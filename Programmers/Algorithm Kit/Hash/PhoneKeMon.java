import java.util.*;

class PhoneKeMon {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer>hs=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
            hs.add(nums[i]);
        
        int max=nums.length/2;
        
        if(hs.size()<max) answer=hs.size();
        else answer=max;
        
        return answer;
    }
}
