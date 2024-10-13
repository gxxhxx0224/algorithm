import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution{
	static int n,arr[][];
	static boolean check[][];
	static int dy[]= {0,-1,0,1},dx[]= {1,0,-1,0};
	static int min,max;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			n=Integer.parseInt(br.readLine());
			arr=new int[n][n];
			
			for(int i=0;i<n;i++) {
				StringTokenizer st =new StringTokenizer(br.readLine());
				
				for(int j=0;j<n;j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			min=Integer.MAX_VALUE; //최대값을 가지는 arr의 최소값
			max=Integer.MIN_VALUE; //이동거리의 최대값
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					check=new boolean[n][n];
					int count=bfs(i,j,1);
					
					if(max<count) {
						max=count;
						min=arr[i][j];
					}
					else if(max==count && min>arr[i][j]) min=arr[i][j];
				}
			}
			sb.append("#"+tc+" "+min+" "+max+"\n");
		}
		System.out.print(sb);
	}
	public static int bfs(int sy,int sx,int count) {
		Queue<int []>q=new LinkedList<>();
		q.add(new int[] {sy,sx,count});
		check[sy][sx]=true;
		int mx=0;
		
		while(!q.isEmpty()) {
			int y=q.peek()[0];
			int x=q.peek()[1];
			count=q.peek()[2];
			q.poll();
			
			mx=Math.max(mx,count);
			
			for(int i=0;i<4;i++) {
				int nextY=y+dy[i];
				int nextX=x+dx[i];
				
				if(nextY>=0 && nextY<n && nextX>=0 && nextX<n && !check[nextY][nextX] && arr[nextY][nextX]-arr[y][x]==1) {
					q.add(new int[] {nextY,nextX,count+1});
					check[nextY][nextX]=true;
				}
			}
		}
		return mx;
	}
}
