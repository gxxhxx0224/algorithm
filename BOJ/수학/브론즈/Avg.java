import jajajavavava.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //과목의 개수
        double grade[] = new double[n];
        StringTokenizer st =new StringTokenizer(br.readLine());

        double max=0;

        for(int i=0;i<n;i++){
            grade[i] = Integer.parseInt(st.nextToken());
            if(max<grade[i]) max = grade[i];
        }
        double sum=0;

        for(int i=0;i<n;i++){
            grade[i] = grade[i]/ max *100 ;
            sum += grade[i];
        }
        br.close();
        System.out.print(sum / n);
    }
}
