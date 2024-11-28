import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc=1;tc<=T;tc++){
            int n=Integer.parseInt(br.readLine());
            int arr[]=new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            int m=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++){
                int num=Integer.parseInt(st.nextToken());
                int low=0;
                int high=n-1;

                boolean ox=false;
                while(low<=high){
                    int mid=(low+high)/2;

                    if(arr[mid]>num) high=mid-1;
                    else if(arr[mid]<num) low=mid+1;
                    else {
                        sb.append(1).append("\n");
                        ox=true;
                        break;
                    }
                }
                if(!ox) sb.append(0+"\n");
            }
        }
        System.out.print(sb);
    }
}
