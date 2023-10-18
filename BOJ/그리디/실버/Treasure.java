import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Treasure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int A[]=new int[n];
        Integer B[]=new Integer[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) A[i]=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) B[i]=Integer.parseInt(st.nextToken());

        br.close();
        
        Arrays.sort(A);
        Arrays.sort(B,Collections.reverseOrder());

        int s=0;
        for(int i=0;i<n;i++){
            s+=(A[i]*B[i]);
        }
        System.out.println(s);

    }
}
