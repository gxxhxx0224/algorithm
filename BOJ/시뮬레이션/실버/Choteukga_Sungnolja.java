import java.util.*;
import java.io.*;

//S3 16738 초특가 숭놀자
//Simulation
public class Main {
	static int n,q;
	static boolean check[];
	static List<Room>rooms;
	
	static class Room{
		int left, right, people;
		
		Room(int l,int r,int p){
			left=l;
			right=r;
			people=p;
		}
	}
	
	//true: 사용불가, false: 사용가능
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken()); //가능한 평수
		q=Integer.parseInt(st.nextToken());
		check=new boolean[n+1];
		rooms=new LinkedList<>();
				
		for(int tc=1;tc<=q;tc++) {
			st=new StringTokenizer(br.readLine());
			String order=st.nextToken();
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			if(order.equals("new"))
				newAB(b,a);
			else if(order.equals("in"))
				inAB(b,a);
			else
				outAB(b,a);
		}
		//new XY: x명의 손님이 y평의 파티룸을 원함. y평 제작 가능하면 새방 할당하고 L R 출력, 불가능하면 REJECTED
		
		//in AB: 시간순 A번째 순서로 할당된 파티룸에 B명의 손님이 추가로 더 들어옴.
		
		//out AB: A번째 순서로 할당된 파티룸에 B명의 손님 퇴실.
	}
	public static void outAB(int b,int a) { //a번째 순서로 할당된 파티룸에 b명의 손님 퇴실
		 Room room=rooms.get(a-1);
		 room.people-=b;
		 
		 if(room.people==0) {
			 for(int i=room.left;i<=room.right;i++) {
				 check[i]=false;
			 }
			 System.out.println("CLEAN "+room.left+" "+room.right);
			 
		 }
	}
	public static void inAB(int b,int a) { //b명의 손님을 a번째 순서 파티룸에 넣음
		Room room=rooms.get(a-1);
		room.people+=b;
	}
	public static void newAB(int b,int a) { //b: 원하는 평수 a:손님 수
		//연속된 b개의 빈방 찾기
		boolean streak=true;
		for(int i=1;i<=n-b+1;i++) {
			streak=true;
			for(int j=i;j<i+b;j++) {
				if(check[j]) {
					streak=false;
					break;
				}
			}
			
			//가능하면 할당하기
			if(streak) {
				for(int j=i;j<i+b;j++) {
					check[j]=true;
				}
				rooms.add(new Room(i,i+b-1,a));
				System.out.println(i+" "+(i+b-1));
				return;
			}
		}
		//불가능하면 "REJECTED"
		System.out.println("REJECTED");
	}
}
