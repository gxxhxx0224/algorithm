import java.util.*;

class BiggestNumber {
    public String solution(int[] numbers) {
        String answer = "";
        String arr[]=new String[numbers.length];
        
        for(int i=0;i<arr.length;i++)
            arr[i]=String.valueOf(numbers[i]);
        
        Arrays.sort(arr,(o1,o2)->(o2+o1).compareTo(o1+o2));
        
        for(int i=0;i<arr.length;i++){
            answer+=arr[i];
        }
        
        return answer;
    }
}
