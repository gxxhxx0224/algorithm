import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1945 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());

			int a, b, c, d, e;
			a = b = c = d = e = 0;
			
			while(n!=1) {
				if(n%2==0) {
					n/=2;
					a++;
				}
				else if(n%3==0) {
					n/=3;
					b++;
				}
				else if(n%5==0) {
					n/=5;
					c++;
				}
				else if(n%7==0) {
					n/=7;
					d++;
				}
				else if(n%11==0) {
					n/=11;
					e++;
				}
			}

			sb.append('#').append(tc).append(' ').append(a+" "+b+" "+c+" "+d+" "+e+'\n');
		}
		System.out.print(sb);
	}

}
