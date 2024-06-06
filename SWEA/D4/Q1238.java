import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1238{
	static int arr[][];
	static int check[];
	static int time,ans,max;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		for(int tc=1;tc<=10;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int start=Integer.parseInt(st.nextToken());
			
			arr=new int[101][101];
			check=new int[101];
			
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<n/2;i++) {
				int from=Integer.parseInt(st.nextToken());
				int to=Integer.parseInt(st.nextToken());
				
				arr[from][to]=1;
			}
			
			time=1;
			max=0;
			bfs(start);
			
			for(int i=1;i<=100;i++) {
				if(check[i]==max) ans=i;
			}
			sb.append("#"+tc+" "+ans+"\n");	
		}
		System.out.print(sb);
	}
	public static void bfs(int now) {
		Queue<int[]>q=new LinkedList<>();
		q.add(new int[] {now,1});
		check[now]=1;
		
		while(!q.isEmpty()) {
			now=q.peek()[0];
			int time=q.peek()[1];
			q.poll();
			
			max=Math.max(max, time);
			
			for(int i=1;i<=100;i++) {
				if(arr[now][i]==1 && check[i]==0 ) {
					q.add(new int[] {i,time+1});
					check[i]=time+1;
				}
			}
		}
	}
}
