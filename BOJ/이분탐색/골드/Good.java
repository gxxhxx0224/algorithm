import java.util.*;
import java.io.*;

//1253 좋다(이진탐색)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;

            while(low<=high){
                //두 숫자의 합으로 나타내야 함. 현재 숫자 가리키면 포인터 이동
                if(low==i) low++;
                else if(high==i) high--;

                if(low>=high) break;

                if(arr[low]+arr[high]>arr[i]) high--;
                else if(arr[low]+arr[high]<arr[i]) low++;
                else {
                    ans++;;
                    break;
                }
            }
        }
        System.out.print(ans);
    }
}

