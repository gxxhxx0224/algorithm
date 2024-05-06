import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1230{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer>list;
		
		for(int tc=1;tc<=10;tc++) {
			list=new LinkedList<>();
			
			//원본 암호문
			int n=Integer.parseInt(br.readLine()); //암호문 개수
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++)
				list.offer(Integer.parseInt(st.nextToken()));
			
			int m=Integer.parseInt(br.readLine()); //명령어의 개수
			st=new StringTokenizer(br.readLine());
			
			while(m-->0) {
				String s=st.nextToken();
				
				if(s.equals("I")) {
					int x=Integer.parseInt(st.nextToken());
					int y=Integer.parseInt(st.nextToken());
					
					for(int idx=x;idx<x+y;idx++) 
						list.add(idx,Integer.parseInt(st.nextToken()));
					
				}
				else if(s.equals("D")) {
					int x=Integer.parseInt(st.nextToken());
					int y=Integer.parseInt(st.nextToken());
					
					for(int idx=0;idx<y;idx++) 
						list.remove(x);
				}
				else if(s.equals("A")) {
					int y=Integer.parseInt(st.nextToken());
					
					for(int idx=0;idx<y;idx++)
						list.offerLast(Integer.parseInt(st.nextToken()));
				}
			}
			sb.append("#"+tc+" ");
			for(int i=0;i<10;i++)
				sb.append(list.get(i)+" ");
			sb.append("\n");
		}
		System.out.println(sb);
		
	}
}
