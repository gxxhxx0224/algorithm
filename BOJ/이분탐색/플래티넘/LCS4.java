import java.io.*;
import java.util.*;

// P5 13711 LCS 4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //두 수열의 크기
        int a[]=new int[n+1];
        int b[]=new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++)
            a[i]=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++) {
            /*
            b[3]=1: 3은 b수열의 1번째
            b[1]=2: 1은 2번째에..
             */
            b[Integer.parseInt(st.nextToken())] = i;
        }

        int lis[]=new int[n+1];
        int length=0;

        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++)
            arr[i]=b[a[i]]; //a수열의 i번째 숫자가 b수열에서 몇번째에 있는지

        for(int i=1;i<=n;i++){
            int num=a[i];

            /*
            lis에서 arr[i]를 사용하는 이유
            두 수열에서 같은 상대적 순서를 가지는 원소들을 찾는 것.
            실제 값(a[i])로 하면 숫자의 크기만 비교하게 되어 LCS를 찾을 수 없음
             */
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
