import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1284 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int P=Integer.parseInt(st.nextToken()); // A사 1L당 요금
			int Q=Integer.parseInt(st.nextToken()); //B사 R리터 이하 요금
			int R=Integer.parseInt(st.nextToken()); //B사 R리터 기준
			int S=Integer.parseInt(st.nextToken()); //B사 1L당 요금
			int W=Integer.parseInt(st.nextToken()); //수도 양
			
			int a=P*W; //A사 이용시 요금
			int b=Q; //B사 이용시 요금
			
		
			if(W>R)
				b=Q+(W-R)*S;
			
			int ans=Math.min(a, b);
			
			sb.append('#').append(tc).append(' ').append(ans).append('\n');
		}
		System.out.print(sb);
		}
		
	}
