import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class DocumentSearch{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String input=br.readLine();
		
		if(str.contains(input))
			str=str.replace(input, "*");
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='*')
				count++;
		}
		
		System.out.print(count);
	}
}
