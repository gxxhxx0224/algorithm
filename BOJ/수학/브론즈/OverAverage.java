import java.io.*;
import java.util.StringTokenizer;

public class OverAverage{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        float c = Float.parseFloat(br.readLine());


        for(int i=0;i<c;i++){
            st = new StringTokenizer(br.readLine());
            float n=Float.parseFloat(st.nextToken());
            float sum=0,avg=0,count=0;
            float[] arr = new float[(int)n];
            for(int j=0;j<n;j++){
                arr[j] = Float.parseFloat(st.nextToken());
                sum+=arr[j];
            }avg=sum/(float)n;
            for(int k=0;k<n;k++){
                if(arr[k]>avg) count++;
            }
            System.out.printf("%.3f%%\n", (count / n)*100);
        }
    }
}
