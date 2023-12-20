import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5215 {
	static int n,l;
	static int food[][];
	static int ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n=Integer.parseInt(st.nextToken());
			l=Integer.parseInt(st.nextToken());
			food=new int[n][2];
			
			for(int i=0;i<n;i++) {
				st=new StringTokenizer(br.readLine());
				
				food[i][0]=Integer.parseInt(st.nextToken());
				food[i][1]=Integer.parseInt(st.nextToken());
			}
		
			ans=0;
			hamburger(0, 0, 0);
			
			sb.append("#" + tc + " " + ans + "\n");
		}
		System.out.print(sb);
	}
	public static void hamburger(int idx,int score,int cal) {
		if(cal>l)
			return;
		if(idx==n) {
			if(score>ans)
				ans=score;
			return;
		}
		
		hamburger(idx+1, score+food[idx][0], cal+food[idx][1]);
		hamburger(idx+1, score, cal);
	}
}
