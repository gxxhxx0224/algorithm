import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Q1229{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		LinkedList<Integer>pw;
		
		for(int tc=1;tc<=10;tc++) {
			int n=Integer.parseInt(br.readLine()); //원본 암호문 뭉치속 암호문의 개수
			pw=new LinkedList<>();
			
			//원본 암호문 뭉치
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++)
				pw.offer(Integer.parseInt(st.nextToken()));
			
			br.readLine(); //명령어의 개수, 날림
			
			st=new StringTokenizer(br.readLine()); //명령어
			
			
			while(st.countTokens()!=0) {
				String cmd=st.nextToken();
				if(cmd.equals("I")) {
					int x=Integer.parseInt(st.nextToken()); //x부터
					int y=Integer.parseInt(st.nextToken()); //y개의 숫자
					
					for(int j=0;j<y;j++)
						pw.add(x+j,Integer.parseInt(st.nextToken()));
					
				}
				else if(cmd.equals("D")) {
					int x=Integer.parseInt(st.nextToken()); //x부터
					int y=Integer.parseInt(st.nextToken()); //y개의 숫자
					
					for(int j=0;j<y;j++)
						pw.remove(x);
				}
			}
			sb.append('#').append(tc).append(' ');
			
			for(int i=0;i<10;i++)
				sb.append(pw.get(i)).append(' ');
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
