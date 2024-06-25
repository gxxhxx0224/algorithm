class fatigability {
    static boolean check[];
    static int answer;
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        
        check=new boolean[dungeons.length];
        
        dfs(0,k,dungeons);
        
        return answer;
    }
    public static void dfs(int depth,int k,int[][] dungeons){
        if(k>=0){
            answer=Math.max(answer,depth);
        }
        
        for(int i=0;i<dungeons.length;i++){
            if(!check[i]&&k>=dungeons[i][0]){
                check[i]=true;
                dfs(depth+1,k-dungeons[i][1],dungeons);
                check[i]=false;   
            }
            
        }
    }
}
