import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(br.readLine());

        Arrays.sort(arr);//오름차순 정렬,

        //1~n: 1의 무게*n
        //2~n: 2의 무게*(n-1)
        //3~n: 2의 무게*(n-2)
        //i의무게 * (n+1-i)
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]*(n-i));
        }
        System.out.println(max);
    }
}
