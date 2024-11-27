import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //전체 용액의 수
        int arr[]=new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        int ans[]=new int[2];

        int low=0;
        int high=n-1;
        int min=Integer.MAX_VALUE; //두 용액의 특성값의 최소

        while(low<high){
            int sum=arr[low]+arr[high];

            if(Math.abs(min)>=Math.abs(sum)){
                min=sum;
                ans[0]=arr[low];
                ans[1]=arr[high];
            }

            if(sum>0) high--;
            else if(sum<0) low++;
            else break;
        }

        System.out.print(ans[0]+" "+ans[1]);
    }
}
