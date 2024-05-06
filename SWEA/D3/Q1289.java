import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q1289{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T=Integer.parseInt(br.readLine()); //테스트 케이스의 수
		
		for(int tc=1;tc<=T;tc++) {
			String str=br.readLine(); //메모리의 원래값
			char now='0';
			int count=0;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)!=now) {
					if(str.charAt(i)=='1') { 
						now='1';
						count++;
					}
					else {
						now='0';
						count++;
					}
				}
			}
			sb.append("#"+tc+" "+count+"\n");
		}
		System.out.println(sb);
	}
}
