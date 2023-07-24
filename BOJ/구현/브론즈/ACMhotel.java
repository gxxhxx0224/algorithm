import java.io.*;
import java.util.StringTokenizer;

public class ACMhotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int num=0;num<t;num++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int h=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());
            int n=Integer.parseInt(st.nextToken());

            boolean[][]hotel=new boolean[h][w];
            for(int i=0;i<w;i++){
                for(int j=0;j<h;j++){
                    hotel[j][i]=true;
                    n--;
                    if(n==0) {
                        System.out.printf("%d%02d\n",j+1,i+1);
                        break;
                    }
                }
            }
        }br.close();

    }
}
