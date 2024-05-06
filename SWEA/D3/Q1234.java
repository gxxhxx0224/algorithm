import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1234{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer>list;
		
		for(int tc=1;tc<=10;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()); //문자열이 포함하는 문자의 총 수
			String str=st.nextToken();
			list=new LinkedList<>();
			
			for(int i=0;i<n;i++) 
				list.offer(Integer.parseInt(String.valueOf(str.charAt(i))));
				
			for(int i=0;i<list.size()-1;i++) {
				if(list.get(i)==list.get(i+1)) {
					list.remove(i);
					list.remove(i);
					i=-1;
				}
			}
			sb.append("#"+tc+" ");
			for(int i=0;i<list.size();i++)
				sb.append(list.get(i));
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
