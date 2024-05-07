import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1210{
	static int target,ans;
	static int arr[][],dy[]= {0,0,-1},dx[]= {1,-1,0};
	static boolean check[][];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//10개의 테스트 케이스
		for(int tc=1;tc<=10;tc++) {
			int T=Integer.parseInt(br.readLine()); //tc 번호
			arr=new int[100][100]; //사다리를 나타내는 배열
			check=new boolean[100][100];
			
			for(int i=0;i<100;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int j=0;j<100;j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
					
					if(arr[i][j]==2) target=j;
				}
			}
			dfs(99,target);
			sb.append("#"+tc+" "+ans+"\n");
		}
		System.out.print(sb);
	}
	public static void dfs(int y,int x) { //2에서부터 위로 올라감
		check[y][x]=true;
		
		if(y==0) {
			ans=x;
			
		}
		for(int i=0;i<3;i++) {
			int nextY=y+dy[i];
			int nextX=x+dx[i];
			
			if(nextY<100&&nextY>=0 && nextX>=0 && nextX<100 
					&& arr[nextY][nextX]==1 && !check[nextY][nextX]) {
				dfs(nextY,nextX);
				return;
			}
		}	
	
	}
}
