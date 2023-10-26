import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2001 {
    static int n;
    static int m;
    static int [][]arr;
    static int sum,max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int tc=0;tc<T;tc++){
            st=new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            arr=new int[n][n];

            for(int i=0;i<n;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                    arr[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            max=0;
            for(int i=0;i<n-m+1;i++){
                for(int j=0;j<n-m+1;j++){
                    sum=0;
                    flySwatter(i,j);
                    if(max<sum) max=sum;
                }
            }
            sb.append('#').append(tc+1).append(' ').append(max).append('\n');
        }
        System.out.println(sb);
    }
    public static void flySwatter(int iIndex,int jIndex){
        for(int i=iIndex;i<iIndex+m;i++){
            for(int j=jIndex;j<jIndex+m;j++){
                sum+=arr[i][j];
            }
        }
    }
}
