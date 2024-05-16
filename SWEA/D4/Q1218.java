import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1218{
	static Stack<String>stack;
	static int ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=10;tc++) {
			int n =Integer.parseInt(br.readLine());
			String input=br.readLine();
			stack=new Stack<>();
			ans=1;
			
			for(int i=0;i<n;i++) {
				String s=String.valueOf(input.charAt(i));
				
				switch(s) {
				
				case "{":
					stack.push("{");
					break;
				case "}":
					if(stack.peek()=="{") 
						stack.pop();	
					else ans=0;
					
					break;
				case "[":
					stack.push("[");
					break;
				case "]":
					if(stack.peek()=="[")
						stack.pop();
					else ans=0;
					
					break;
					
				case "(":
					stack.push("(");
					break;
				case ")":
					if(stack.peek()=="(")
						stack.pop();
					else ans=0;
					
					break;
				case "<":
					stack.push("<");
					break;
				case ">":
					if(stack.peek()=="<")
						stack.pop();
					else ans=0;
					
					break;
				}
				if(ans==0) break;
			}
			sb.append("#"+tc+" "+ans+"\n");
		}
		System.out.print(sb);
	}
}
