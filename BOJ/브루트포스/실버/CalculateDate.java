import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class CalculateDate{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int E=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int count=0;
		
		int a,b,c;
		a=b=c=0;
		
		while(true) {
			a++;
			b++;
			c++;
			count++;
			
			if(a==E && b==S && c==M)
				break;
			
			a%=15;
			b%=28;
			c%=19;
			
		}
		System.out.print(count);
	}
}
