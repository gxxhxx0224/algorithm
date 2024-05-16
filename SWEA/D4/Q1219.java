import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1219{
	static int arr[][];
	static boolean check[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=10;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int T=Integer.parseInt(st.nextToken()); //테스트 케이스 번호
			int n=Integer.parseInt(st.nextToken()); //길의 총 개수 
			arr=new int[100][100];
			check=new boolean[100];
			
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				int from=Integer.parseInt(st.nextToken());
				int to=Integer.parseInt(st.nextToken());
				
				arr[from][to]=1;
			}
			bfs();
			
			int ans=0;
			
			if(check[99]) ans=1;
			
			sb.append("#"+T+" "+ans+"\n");
		}
		System.out.print(sb);
	}
	public static void bfs() {
		Queue<Integer>q=new LinkedList<>();
		q.add(0);
		check[0]=true;
		
		while(!q.isEmpty()) {
			int from=q.peek();
			q.poll();
			
			for(int i=0;i<100;i++) {
				if(from==i) continue;
				
				if(arr[from][i]==1 && !check[i]) {
					q.add(i);
					check[i]=true;
				}
			}
		}
	}
}
