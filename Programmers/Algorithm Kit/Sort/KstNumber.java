import java.util.*;

class KstNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        int i;
        int j;
        int k;
        int arr[];
        
        List<Integer>list=new LinkedList<>();

        for(int idx=0;idx<commands.length;idx++){
            i=commands[idx][0]-1;
            j=commands[idx][1]-1;
            k=commands[idx][2]-1;
            
            arr=new int[j-i+1];
            
            int cnt=0;
            for(int start=i;start<=j;start++){
                arr[cnt]=array[start];
                cnt++;
            }
            Arrays.sort(arr);
            list.add(arr[k]);
        }
        answer=new int[list.size()];
        
        for(int idx=0;idx<answer.length;idx++)
            answer[idx]=list.get(idx);
        
        return answer;
    }
}
