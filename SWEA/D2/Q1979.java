import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1979 {
    static int n,k;
    static int puzzle[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine()); //tc
        StringBuilder sb = new StringBuilder();

        for(int tc=1;tc<=T;tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n=Integer.parseInt(st.nextToken());
            k=Integer.parseInt(st.nextToken());
            puzzle=new int[n+2][n+2];

            for(int i=1;i<=n;i++){
                st=new StringTokenizer(br.readLine());

                for(int j=1;j<=n;j++)
                    puzzle[i][j]=Integer.parseInt(st.nextToken());
            }

            int ans=0;

            for(int i=1;i<=n;i++)
                for(int j=1;j<=n-k+1;j++)
                    ans+=check(i,j);

            sb.append('#').append(tc).append(' ').append(ans).append('\n');
        }
        System.out.print(sb);
    }
    public static int check(int i,int j){
        int count=0;
        int rowCnt=0;
        int colCnt=0;

        for(int index=j;index<j+k;index++){
            rowCnt+=puzzle[i][index];
            colCnt+=puzzle[index][i];
        }

        if(rowCnt==k && puzzle[i][j-1]==0&&puzzle[i][j+k]==0)
            count++;
        if(colCnt==k && puzzle[j-1][i]==0&&puzzle[j+k][i]==0)
            count++;

        return count;
    }
}
