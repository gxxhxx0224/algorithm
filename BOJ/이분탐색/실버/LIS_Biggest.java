import java.util.*;
import java.io.*;

//11055 가장 큰 증가하는 부분수열
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n+1];
		int dp[]=new int[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++){
			arr[i]=Integer.parseInt(st.nextToken());
			dp[i]=arr[i];
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				if(arr[i]<arr[j]) {
					dp[j]=Math.max(dp[i]+arr[j], dp[j]);
				}
			}
		}
		
		int max=0;
		for(int i=1;i<=n;i++)
			max=Math.max(max, dp[i]);
		
		System.out.print(max);
	}
}
