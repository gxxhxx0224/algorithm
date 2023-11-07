import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1954 {

    static int colDir[] = {1, 0, -1, 0};
    static int rowDir[]={0,1,0,-1};
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int arr[][];

        for(int tc=1;tc<=T;tc++){
            int n = Integer.parseInt(br.readLine());
            arr = new int[n][n];

            int row=0,col=0; //시작지점
            int dir=0; //방향 인덱스
            for(int i=1;i<=n*n;i++){
                arr[row][col]=i;
                
                int nextRow=row+rowDir[dir];
                int nextCol=col+colDir[dir];
                
                if(nextRow>=n || nextRow<0 || nextCol>=n || nextCol<0 || //범위를 벗어나거나
                                        arr[nextRow][nextCol]!=0){ //이미 방문한 경우
                    dir=(dir+1)%4; //방향 전환
                }
                row+=rowDir[dir];
                col+=colDir[dir];
            }
            sb.append('#').append(tc).append('\n');

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) sb.append(arr[i][j]).append(' ');
                sb.append('\n');
            }
        }br.close();
        System.out.println(sb);

    }
}
