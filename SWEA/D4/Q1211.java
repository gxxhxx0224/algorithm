import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1211{
	static int arr[][];
	static int distance,X;
	static boolean check[][];
	static int dy[]= {0,0,1},dx[]= {1,-1,0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=10;tc++) {
			int T=Integer.parseInt(br.readLine());
			arr=new int[102][102];
			
			for(int i=1;i<=100;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=1;j<=100;j++) {
					int num=Integer.parseInt(st.nextToken());
					arr[i][j]=num;
				}
			}
			
			int X=-1;
			int min=Integer.MAX_VALUE;
			
			
			for(int i=1;i<=100;i++) {
				check=new boolean[102][102];
				dfs(1,i,1);
				
				if(min>=distance) {
					min=distance;
					X=i-1;
				}
			}
			sb.append("#"+tc+" "+X+"\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int y,int x,int dist) {
		check[y][x]=true;
		
		if(y==100) distance=dist;
		
		for(int i=0;i<3;i++) {
			int nextY=y+dy[i];
			int nextX=x+dx[i];
			
			if(nextY>=1 && nextY<=100 && nextX>=1 && nextX<=100 && 
					arr[nextY][nextX]==1 && !check[nextY][nextX]) {
				dfs(nextY,nextX,dist+1);
				check[nextY][nextX]=false;
				return;
			}
		}
	}
}
