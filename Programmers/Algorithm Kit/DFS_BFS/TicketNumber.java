class TicketNumber {
    static int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        dfs(0,0,numbers,target);
        
        return answer;
    }
    public static void dfs(int sum,int idx,int[] numbers,int target){
        if(idx==numbers.length){
            if(target==sum){
                answer++;
            }
            return;
        }
        
        
            dfs(sum+numbers[idx],idx+1,numbers,target);
            dfs(sum-numbers[idx],idx+1,numbers,target);    
        
    }
}
