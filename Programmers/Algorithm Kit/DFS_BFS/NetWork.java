class NetWork {
    static boolean check[];
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        check=new boolean[n];
        
        for(int i=0;i<computers.length;i++){
            if(!check[i]){
                dfs(i,n,computers);
                answer++;
            }
        }
        
        return answer;
    }
    public static void dfs(int depth,int n,int[][] computers){
        
        for(int i=0;i<n;i++){
            if(!check[i] && computers[depth][i]==1){
                check[i]=true;
                dfs(i,n,computers);
            }
        }
    }
}
