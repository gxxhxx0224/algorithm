import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1249{
	static int n,arr[][];	
	static int check[][];
	static int dy[]= {0,-1,0,1},dx[]= {1,0,-1,0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			n=Integer.parseInt(br.readLine());
			arr=new int[n][n];
			check=new int[n][n];
			for(int i=0;i<n;i++) {
				String input=br.readLine();
				
				for(int j=0;j<n;j++) {
					arr[i][j]=input.charAt(j)-'0';
					check[i][j]=Integer.MAX_VALUE;
				}
			}
			bfs(0,0,0);
			
			sb.append("#"+tc+" "+check[n-1][n-1]+"\n");
		}
		System.out.print(sb);
	}
	public static void bfs(int y,int x,int sum) {
		Queue<int []>q=new LinkedList<>();
		q.add(new int[] {y,x,sum});
		check[y][x]=sum;
		
		while(!q.isEmpty()) {
			y=q.peek()[0];
			x=q.peek()[1];
			sum=q.peek()[2];
			q.poll();
			
			for(int i=0;i<4;i++) {
				int nextY=y+dy[i];
				int nextX=x+dx[i];
				
				if(nextY>=0 && nextY<n && nextX>=0 && nextX<n) {
					int nextSum=sum+arr[nextY][nextX];
					
					if(check[nextY][nextX]>nextSum) {
						check[nextY][nextX]=nextSum;
						q.add(new int[] {nextY,nextX,nextSum});
					}
				}
			}
		}
	}
}
