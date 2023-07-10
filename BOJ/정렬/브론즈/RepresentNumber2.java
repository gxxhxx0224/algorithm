import java.io.*;

public class RepresentNumber2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[]arr=new int[5]; //배열 생성
        int sum=0;
        for(int i=0;i<5;i++) {
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i]; //합
        }br.close();
        System.out.println(sum/5);

        for(int i=0;i<4;i++){ //비교 후 정렬
            for(int j=i+1;j<5;j++){
                if(arr[j]<arr[i]){
                    int prev=arr[i];
                    arr[i]=arr[j];
                    arr[j]=prev;
                }
            }

        }
        System.out.println(arr[2]);

    }
}
