import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGCB {
    static String arr[][];
    static boolean check[][],rgArr[][],rgCheck[][];
    static int n,dx[]={1,0,-1,0},dy[]={0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new String[n+1][n+1];
        rgArr=new boolean[n+1][n+1];
        check=new boolean[n+1][n+1];
        rgCheck=new boolean[n+1][n+1];

        for(int i=1;i<=n;i++){
            String str=br.readLine();

            for(int j=1;j<=n;j++) {
                String s=String.valueOf(str.charAt(j-1));
                arr[i][j] =s;

                if(s.equals("R")||s.equals("G"))
                    rgArr[i][j]=true;
            }
        }
        int count=0;
        int rgCount=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(!check[i][j]){
                    count++;
                    dfs(i,j);
                }
                if(!rgCheck[i][j]){
                    rgCount++;
                    rgDfs(i,j);
                }
            }
        }
        System.out.println(count+" "+rgCount);
    }

    public static void dfs(int y,int x) {
        String str=arr[y][x];
        check[y][x]=true;

        for(int i=0;i<4;i++){
            int nextY=y+dy[i];
            int nextX=x+dx[i];

            if(nextY>=1 && nextY<=n && nextX>=1 && nextX<=n
                    &&str.equals(arr[nextY][nextX])&&!check[nextY][nextX]){
                dfs(nextY,nextX);
            }
        }
    }
    public static void rgDfs(int y,int x){
        boolean now=rgArr[y][x];
        rgCheck[y][x]=true;

        for(int i=0;i<4;i++){
            int nextY=y+dy[i];
            int nextX=x+dx[i];

            if(nextY>=1 && nextY<=n && nextX>=1 && nextX<=n
                    &&now==rgArr[nextY][nextX]&&!rgCheck[nextY][nextX]){
                rgDfs(nextY,nextX);
            }
        }
    }
}
