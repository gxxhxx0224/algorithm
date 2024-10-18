import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution{
	static int arr[][];
	static int dy[]= {0,-1,0,1},dx[]= {1,0,-1,0};
	static HashSet<String>hs;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T=Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			hs=new HashSet<>();
			arr=new int[4][4];
			
			for(int i=0;i<4;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0;j<4;j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					dfs(0,i,j,"");
				}
			}
			
			sb.append("#"+tc+" "+hs.size()+" "+"\n");
		}
		System.out.print(sb);
	}
	public static void dfs(int idx,int y,int x,String str) {
		if(idx==7) {
			hs.add(str);
			return;
		}
		
	
		for(int i=0;i<4;i++) {
			int nextY=y+dy[i];
			int nextX=x+dx[i];
			
			if(nextY>=0 && nextY<4 && nextX>=0 && nextX<4) {
				dfs(idx+1,nextY,nextX,str+arr[nextY][nextX]);
			}
		}
	}
}
