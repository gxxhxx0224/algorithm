class WayToSchool {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int dp[][]=new int[n+1][m+1];
        boolean check[][]=new boolean[n+1][m+1];
        
        dp[1][1]=1;
        check[1][1]=true;
        
        for(int i=0;i<puddles.length;i++){
            int a=puddles[i][0];
            int b=puddles[i][1];
            
            dp[b][a]=-1;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if((i==1 && j==1) || dp[i][j]==-1) continue;
                
                if(dp[i][j-1]!=-1) {
                    dp[i][j]+=dp[i][j-1]%1000000007;
                    check[i][j]=true;
                }
                if(dp[i-1][j]!=-1) {
                    dp[i][j]+=dp[i-1][j]%1000000007;
                    check[i][j]=true;
                }
            }
        }
        if(check[n][m]) answer=dp[n][m]%1000000007;
        
        return answer;
    }
}
