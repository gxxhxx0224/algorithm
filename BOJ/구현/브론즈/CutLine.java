import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class CutLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        br.close();
        int x[]=new int[n]; //학생의 점수가 들어갈 배열
        for(int i=0;i<n;i++) x[i]=Integer.parseInt(st.nextToken());

        Arrays.sort(x);
        System.out.print(x[n-k]);
        }
    }
