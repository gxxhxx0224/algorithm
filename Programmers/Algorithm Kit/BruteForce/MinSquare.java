class MinSquare {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x[]=new int[sizes.length];
        int y[]=new int[sizes.length];
        
        int mx=0;
        int my=0;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                x[i]=sizes[i][1];
                y[i]=sizes[i][0];
            }
            else{
                x[i]=sizes[i][0];
                y[i]=sizes[i][1];
            }
            mx=Math.max(mx,x[i]);
            my=Math.max(my,y[i]);
        }
        answer=mx*my;
        return answer;
    }
}
