import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SumOfDivisiors{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n=Integer.parseInt(br.readLine());
            int index=0,sum=0;
            if(n==-1) break;

            int arr[]=new int[n];   //약수 배열

            for(int i=1;i<n;i++){
                if(n%i==0){
                    arr[index++]=i;
                    sum+=i;
                }
            }
            if(sum!=n) {
                System.out.println(n+" is NOT perfect.");
                continue;
            }
            System.out.print(n+" = ");
            for(int i=0;i<index;i++){
                if(i<index-1){
                    System.out.print(arr[i]+" + ");
                }
                else System.out.println(arr[i]);
            }
        }br.close();
    }
}
