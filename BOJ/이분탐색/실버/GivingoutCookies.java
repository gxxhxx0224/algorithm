package date_0725;

import java.util.*;
import java.io.*;

//1654 S2 "랜선 자르기"
public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m=Integer.parseInt(st.nextToken()); //조카의 수
		int n=Integer.parseInt(st.nextToken()); //과자의 수
		int arr[]=new int[n+1];
		
		long max=0;
		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			max=Math.max(max, arr[i]);
		}
		
		long low=1;
		long high=max;
		long answer=0;
		while(low<=high) {
			long mid=(low+high)/2;
			int count=0;
			
			for(int i=1;i<=n;i++) {
				count+=arr[i]/mid;
			}
			
			if(count>=m) { //설정길이 짧아서, 더 많은 조카에게 줄 수 있는 경우
				answer=mid; //현재 길이 저장
				low=mid+1;  //더 긴 길이 탐색
			}else
				high=mid-1; //더 짧은 길이 탐색
		}
		System.out.println(answer);
	}
	
}
