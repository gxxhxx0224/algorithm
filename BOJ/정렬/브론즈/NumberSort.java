import java.io.*;
import java.util.Arrays;

public class NumberSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());  //수의 개수
        int[]arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=Integer.parseInt(br.readLine());
        br.close();

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) System.out.println(arr[i]);
    }
}
