import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1974 {
    static int arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        arr=new int[10][10];

        for(int tc=1;tc<=T;tc++){

            for(int i=1;i<=9;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=1;j<=9;j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int ans=1;
            
            //row,col
            for(int i=1;i<=9;i++){
                int rSum=0;
                int cSum=0;
                for(int j=1;j<=9;j++){
                    rSum+=arr[i][j];
                    cSum+=arr[j][i];
                }
                if(rSum!=45 || cSum!=45){
                    ans=0;
                    break;
                }
            }
            if(ans==1){
                //3x3 체크
                for(int i=1;i<=7;i+=3){
                    for(int j=1;j<=7;j+=3){
                        if(check3x3(i,j)!=45){
                            ans=0;
                            break;
                        }
                    }
                    if(ans==0) break;
                }
            }
            System.out.println("#"+tc+" "+ans);
        }
    }
    public static int check3x3(int i,int j){
        int sum=0;
        for(int row=i;row<=i+2;row++){
            for(int col=j;col<=j+2;col++){
                sum += arr[row][col];
            }
        }
        return sum;
    }
}
