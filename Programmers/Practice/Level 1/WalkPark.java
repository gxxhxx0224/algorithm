class WalkPark {
    static int arr[][];
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        arr=new int[park.length][park[0].length()];
        
        //시작지점 도출
        int sy=-1;
        int sx=-1;
        
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[i].length();j++){
                if(park[i].charAt(j)=='S'){
                    sy=i;
                    sx=j;
                }
                if(park[i].charAt(j)=='X') arr[i][j]=-1;
            }
        }
        
        answer=bfs(sy,sx,routes);
        
        return answer;
    }
    public static int[] bfs(int y,int x,String[] routes){        
        int ans[]=new int[2];
        
        for(int i=0;i<routes.length;i++){
            int ny=y;
            int nx=x;
            
            String []str=routes[i].split(" ");
            String dir=str[0];
            int dist=Integer.parseInt(str[1]);
            
            boolean check=true; //이동하냐 마냐
            
            for(int j=0;j<dist;j++){
                if(dir.equals("E")) nx++;
                else if(dir.equals("W")) nx--;
                else if(dir.equals("S")) ny++;
                else if(dir.equals("N")) ny--;
                
                if(nx<0 || nx>=arr[0].length || ny<0 || ny>=arr.length || arr[ny][nx]==-1){
                    check=false;
                    break;
                }
            }
            if(check){
                y=ny;
                x=nx;
            }
        }
        ans[0]=y;
        ans[1]=x;
        return ans;
    }
}
