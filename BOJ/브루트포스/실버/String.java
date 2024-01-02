import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class String{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A=st.nextToken();
		String B=st.nextToken();
		
		int gap=B.length()-A.length();
		int min=51;
		
		for(int i=0;i<=gap;i++) {
			int count=0;
			
			for(int j=0;j<A.length();j++) {
				if(A.charAt(j)!=B.charAt(j+i))
					count++;
			}
			min=Math.min(min, count);
		}
		System.out.print(min);
	}
}
