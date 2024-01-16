import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Elections{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); //후보의 수
        int arr[]=new int[n];

        int max=0;
        int maxIdx=-1;

        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(br.readLine());

            if(max<=arr[i]) {
                max=arr[i];
                maxIdx=i;
            }
        }

        int count=0;

        while(arr[0]<=arr[maxIdx]) {
            if(arr.length==1 || maxIdx==0)
                break;
            
            arr[maxIdx]--;
            arr[0]++;
            count++;

            for(int i=0;i<n;i++) {
                if(i==0 || maxIdx==i)
                    continue;

                if(arr[maxIdx]<=arr[i]) 
                    maxIdx=i;
            }
        }

        System.out.print(count);
    }
}
