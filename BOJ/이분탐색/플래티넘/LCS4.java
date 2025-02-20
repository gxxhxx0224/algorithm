import java.io.*;
import java.util.*;

//P5 13711 LCS 4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n+1];
        int b[]=new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++)
            a[i]=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++) {
            int num = Integer.parseInt(st.nextToken());
            b[num]=i;
        }

        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=b[a[i]];
        }

        int length=0;
        int lis[]=new int[n+1];

        for(int i=1;i<=n;i++){
            if(lis[length]<arr[i]){
                lis[++length]=arr[i];
            }else{
                int low=1;
                int high=length;

                while(low<high){
                    int mid=(low+high)/2;

                    if(lis[mid]<arr[i])
                        low=mid+1;
                    else high=mid;
                }
                lis[low]=arr[i];
            }
        }
        System.out.print(length);

    }
}
