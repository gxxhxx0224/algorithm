import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n,m,arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        arr=new int[n][m];

        for(int i=0;i<n;i++){
            String input=br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j]=input.charAt(j)-'0';
            }
        }
        int len=Math.min(n,m);
        int maxSize=1;
        while(len>1){
            for(int i=0;i<=n-len;i++){
                for(int j=0;j<=m-len;j++){
                   int num=arr[i][j];

                   if(num==arr[i][j+len-1] && num==arr[i+len-1][j] && num==arr[i+len-1][j+len-1]) {
                       maxSize = Math.max(maxSize, len * len);
                       break;
                   }
                }
                if(maxSize>1) break;
            }
            if(maxSize>1) break;
            else {
                len--;
            }
        }
        System.out.println(maxSize);
    }
}
