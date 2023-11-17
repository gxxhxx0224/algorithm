import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1986 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			int n=Integer.parseInt(br.readLine());
			
			int sum=0;
			for(int i=1;i<=n;i++) {
				if(i%2!=0)
					sum+=i;
				else
					sum-=i;
			}
			
			sb.append('#').append(tc).append(' ').append(sum).append('\n');
		}
		System.out.print(sb);
		}
		
	}
