import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1226{
	static int ans,arr[][];
	static int dy[]= {0,1,0,-1},dx[]= {1,0,-1,0};
	static int startY,startX,endY,endX;
	static boolean check[][];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=10;tc++) {
			int T=Integer.parseInt(br.readLine());
			arr=new int[16][16];
			check=new boolean[16][16];
			
			for(int i=0;i<16;i++) {
				String input=br.readLine();
				
				for(int j=0;j<16;j++) {
					int num=input.charAt(j)-'0';
					arr[i][j]=num;
					
					if(num==1) check[i][j]=true;
					
					if(num==2) {
						startY=i;
						startX=j;
					}
					if(num==3) {
						endY=i;
						endX=j;
					}
				}
			}
			ans=0;
			
			dfs(startY,startX);
			
			sb.append("#"+T+" "+ans+"\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int y,int x) {
		check[y][x]=true;
		
		if(y==endY && x==endX) ans=1;
		
		for(int i=0;i<4;i++) {
			int nextY=y+dy[i];
			int nextX=x+dx[i];
			
			if(nextY>=0 && nextY<16 && nextX>=0 && nextX<16 &&
					arr[nextY][nextX]!=1 && !check[nextY][nextX]) {
				dfs(nextY,nextX);
				check[nextY][nextX]=false;
			}
		}
	}
}
