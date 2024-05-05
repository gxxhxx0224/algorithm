import java.util.Scanner;

public class Q1217{
	static int ans;
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		for(int tc=1;tc<=10;tc++) {
			int t=sc.nextInt(); //테스트 케이스의 번호
			int n=sc.nextInt();
			int m=sc.nextInt();
			ans=1;
			
			System.out.println("#"+t+" "+recur(n,m));
		}
		sc.close();
	}
	public static int recur(int n,int m) {
		
		if(m!=0) {
			ans=ans*n;
			recur(n,m-1);
		}
		return ans;
	}
}
