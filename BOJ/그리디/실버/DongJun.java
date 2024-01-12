import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DongJun{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()); //후보의 수
		int arr[]=new int[n]; 
		
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(br.readLine());
		
		int count=0;
		
		for(int i=n-1;i>=1;i--) {
			while(arr[i]<=arr[i-1]) {
				arr[i-1]--;
				count++;
			}
		}
		System.out.print(count);			
	}
}
