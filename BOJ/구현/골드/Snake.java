import java.util.*;
import java.io.*;

public class Main {
    static int n, k, l,time, arr[][];
    static int dy[]={0,1,0,-1},dx[]={1,0,-1,0};
    static Map<Integer,String>hash;
    static List<int[]> snake;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine()); //보드의 크기
        arr =new int[n][n];
        snake =new ArrayList<>();
        hash=new HashMap<>();

        k = Integer.parseInt(br.readLine()); //사과의 개수
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;

            arr[y][x]=1;
        }

        l=Integer.parseInt(br.readLine());
        for(int i=0;i<l;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            String d=st.nextToken();

            hash.put(x,d);
        }
        search(0,0);
        System.out.print(time);
    }
    public static void search(int y,int x){
        snake.add(new int[]{y,x});
        arr[y][x]=2;

        time=0;
        int d=0;
        while(true){
            int ny=y+dy[d];
            int nx=x+dx[d];

            time++;

            //뱀의 이동
            
            if(ny>=0 && ny<n && nx>=0 && nx<n && !boom(ny,nx)){ //범위 안 && 충돌x면
                if(arr[ny][nx]==1){ //사과일 경우
                    snake.add(new int[]{ny,nx}); //머리 증가
                    arr[ny][nx]=0;
                }else{ //빈칸
                    snake.add(new int[]{ny,nx}); //이동
                    snake.remove(0);
                }
            }else break; //범위를 벗어남 or 충돌

            //방향전환 할 시간
            if(hash.containsKey(time)){
                if(hash.get(time).equals("D")){
                    d=(d+1)%4;
                }else d=(d+3)%4;
            }
            y=ny;
            x=nx;
        }
    }
    public static boolean boom(int y,int x){
        if(y<0 || y>=n || x<0 || x>=n) return true;

        for(int i=0;i<snake.size();i++){
            int t[]=snake.get(i);

            if(y==t[0] && x==t[1]) return true;
        }
        return false;
    }
}
