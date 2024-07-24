class Triangle {
    static Integer dp[][];
    static int triangle[][];
    public int solution(int[][] triangle) {
        int answer = 0;
        this.triangle=triangle;
        
        dp=new Integer[triangle.length][triangle.length];

        for(int i=0;i<triangle.length;i++){
            dp[triangle.length-1][i]=triangle[triangle.length-1][i];
        }
        
        return recur(0,0);
    }
    public static int recur(int depth,int n){
        
        if(dp[depth][n]==null){
            dp[depth][n]=Math.max(recur(depth+1,n+1),recur(depth+1,n))+triangle[depth][n];
        }
        return dp[depth][n];
    }
}
