import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1227{
	static int arr[][];
	static boolean check[][];
	static int dy[]= {0,-1,0,1},dx[]= {1,0,-1,0};
	static int endY,endX,ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=10;tc++) {
			int T=Integer.parseInt(br.readLine());
			arr=new int[100][100];
			check=new boolean[100][100];
			
			int startY=0;
			int startX=0;
			for(int i=0;i<100;i++) {
				String input=br.readLine();
				for(int j=0;j<100;j++) {
					arr[i][j]=input.charAt(j)-'0';
					
					if(arr[i][j]==2) {
						startY=i;
						startX=j;
					}
					else if(arr[i][j]==3) {
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
		
		if(y==endY && x==endX) {
			ans=1;
			return;
		}
		
		for(int i=0;i<4;i++) {
			int nextY=y+dy[i];
			int nextX=x+dx[i];
			
			if(nextY>=0 && nextY<100 && nextX>=0 && nextX<100 &&
					arr[nextY][nextX]!=1 && !check[nextY][nextX]) {
				dfs(nextY,nextX);
				check[nextY][nextX]=false;
			}
			
		}
	}
}
