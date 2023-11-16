import java.io.*;
import java.util.*;

class Q1228{
	static LinkedList <Integer> pw;
	static int n;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int tc=1;tc<=10;tc++) {
			pw = new LinkedList<>();
			n=Integer.parseInt(br.readLine()); //원본 암호문의 길이
			
			//원본 암호문
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			for(int i=0;i<n;i++)
				pw.offer(Integer.parseInt(st.nextToken()));
			
			int orderN=Integer.parseInt(br.readLine()); //명렁어의 개수
			
			st=new StringTokenizer(br.readLine()); //명령어
			
			for(int i=0;i<orderN;i++) {	
				if(st.nextToken().equals("I")) {
					int x=Integer.parseInt(st.nextToken()); //x위치 바로 다음에
					int y=Integer.parseInt(st.nextToken()); //y개의 숫자 삽입
				
					for(int j=0;j<y;j++) 
						pw.add(x+j, Integer.parseInt(st.nextToken())); //x의 위치 바로 다음에 숫자삽입
				
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
