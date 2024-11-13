import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n,arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine()); //지방의 수

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr=new int[n];

        int sum=0;
        int max=-1;
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
            sum+=arr[i];
            max=Math.max(max,arr[i]);
        }
        Arrays.sort(arr);

        int m=Integer.parseInt(br.readLine()); //총 예산

        if(sum<=m){ //모든 요청이 배정될 수 있는 경우
            System.out.print(max);
        }else{ //모든 요청이 배정될 수 없는 경우
            int low=1;
            int high=m;

            while(low<high-1){
                int mid=(low+high)/2;

                if(f(mid)<=m) low=mid;
                else if(f(mid)>m)high=mid;
            }
            System.out.print(low);
        }
    }
    public static int f(int high){
        int total=0;
        for(int i=0;i<n;i++){
            total+=Math.min(arr[i],high); //상한값과 지방예산 중 작은 것을 더함
        }
        return total;
    }
}
