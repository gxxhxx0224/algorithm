class Solution {
    public int solution(int[][] board, int[][] skill) {
        int answer=d(board,skill);
        
        return answer;
    }
    public static int d(int[][] board,int[][] skill){
        int n=board.length; //세로
        int m=board[0].length; //가로
        
        int sum[][]=new int[n+1][m+1]; //누적합 배열
        
        for(int i=0;i<skill.length;i++){ //스킬횟수만큼
            int power=(skill[i][0]==1)?-skill[i][5]:skill[i][5]; //공격/힐에 따른 딜/힐량
            
            int y1=skill[i][1];
            int x1=skill[i][2];
            int y2=skill[i][3];
            int x2=skill[i][4];
            
            //범위 세팅
            sum[y1][x1]+=power;
            sum[y1][x2+1]-=power;
            sum[y2+1][x1]-=power;
            sum[y2+1][x2+1]+=power;
        }
        
        //가로 누적합
        for(int y=0;y<sum.length;y++){
            for(int x=1;x<sum[0].length;x++){
                sum[y][x]+=sum[y][x-1];
            }
        }
        
        //세로 누적합
        for(int x=0;x<sum[0].length;x++){
            for(int y=1;y<sum.length;y++){
                sum[y][x]+=sum[y-1][x];
            }
        }
        
        int count=0; //파괴되지 않은 건물의 수
        
        for(int y=0;y<n;y++){
            for(int x=0;x<m;x++){
                board[y][x]+=sum[y][x]; //누적합 적용
                
                //건물이 파괴되지 않았으면
                if(board[y][x]>0) count++; 
            }
        }
        return count;
    }
}
