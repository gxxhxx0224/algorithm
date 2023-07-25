import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SeventhDwarf{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hat[]=new int[9];
        int sum=0; //모두의 합

        for(int i=0;i<9;i++) {
            hat[i] = Integer.parseInt(br.readLine());
            sum += hat[i];
        }
        br.close();

        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if (sum - hat[i] - hat[j] == 100) {
                    hat[i]=0;
                    hat[j]=0;
                    for(int k=0;k<9;k++){
                        if(hat[k]!=0) System.out.println(hat[k]);
                    }
                    return;
                }
            }
        }
    }
}
