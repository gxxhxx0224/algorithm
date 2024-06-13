import java.util.*;

class MockExam {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int arr1[]={1,2,3,4,5}; //5
        int arr2[]={2,1,2,3,2,4,2,5}; //8
        int arr3[]={3,3,1,1,2,2,4,4,5,5}; //10
        int ans[]=new int[3];
        
        List<Integer>list=new LinkedList<>();
        
        for(int i=0;i<answers.length;i++){
            if(arr1[i%5]==answers[i]) ans[0]++;
            if(arr2[i%8]==answers[i]) ans[1]++;
            if(arr3[i%10]==answers[i]) ans[2]++;            
        }
        int max=Math.max(ans[0],Math.max(ans[1],ans[2]));
        
        for(int i=0;i<3;i++){
            if(max==ans[i]) list.add(i+1);
        }
        
        answer=new int[list.size()];
        
        for(int i=0;i<list.size();i++) answer[i]=list.get(i);
        
        return answer;
    }
}
