import java.util.*;
import java.io.*;

//2491 S4 수열
public class Main {
    static int n,arr[],upPrefix[],downPrefix[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n+1];
        upPrefix=new int[n+1];
        downPrefix=new int[n+1];
        Arrays.fill(upPrefix,1);
        Arrays.fill(downPrefix,1);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++) arr[i]=Integer.parseInt(st.nextToken());

        int max=Math.max(up(),down());

        System.out.print(max);
    }
    public static int up(){
        int max=1;
        for(int i=1;i<n;i++){
            if(arr[i]<=arr[i+1]){
                upPrefix[i+1]=upPrefix[i]+1;
                max=Math.max(max,upPrefix[i+1]);
            }
        }


        return max;
    }
    public static int down(){
        int max=1;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i+1]){
                downPrefix[i+1]=downPrefix[i]+1;
                max=Math.max(max,downPrefix[i+1]);
            }
        }

        return max;
    }
}
