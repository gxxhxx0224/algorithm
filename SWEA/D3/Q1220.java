import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//swea 1220 Magnetic
public class Q1220 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for(int tc=1;tc<=10;tc++){
            int n=Integer.parseInt(br.readLine());
            int arr[][]=new int[n][n];

            for(int i=0;i<n;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++)
                    arr[i][j]=Integer.parseInt(st.nextToken());
            }
            int count=0;

            for(int row=0;row<n;row++){
                int prev=0; //직전

                for(int col=0;col<n;col++){
                    if(arr[col][row]==1){
                        prev=1;;
                    }
                    else if(prev==1 && arr[col][row]==2){
                        prev=2;
                        count++;
                    }
                }
            }
            sb.append("#"+tc+" "+count+"\n");
        }
        System.out.print(sb);
    }
}
