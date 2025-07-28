package date_0725;
import java.util.*;
import java.io.*;
import java.io.*;

//14426 S1 "접두사 찾기" - 이분탐색
public class Solution {
	static int n;
	static String s[];
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		s=new String[n];
		for(int i=0;i<n;i++)
			s[i]=br.readLine();
		
		Arrays.sort(s);
		
		int ans=0;
		for(int j=0;j<m;j++) {
			String str=br.readLine();
			boolean count=binarySearch(str);
			
			if(count)
				ans++;
		}
		System.out.println(ans);
	}
	public static boolean binarySearch(String str) {
		int low=0;
		int high=s.length-1; //테스트할 문자열을 가지고 s[]안에서 탐색할 것임.
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(s[mid].startsWith(str))
				return true;
			
			if(s[mid].compareTo(str)<0) //s[mid]의 길이 < str의 길이인 경우: "".compareTo("abcd") == -4, 볼 것도 없다.
				low=mid+1;
			else //s[mid]>=str의 길이인 경우: "abcd".compareTo("") == 4, "abcd".compareTo("abcd")==0
				high=mid-1; 		
		}
		
		return false;
	}
}
