import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        br.close();
        int count=0;
        int p=0; //나눔

        for(int i=0;i<n;i++){
            int a=Integer.parseInt(st.nextToken());
            if(a==1) continue;

            for(int j=2;j<=1000;j++){

                if(a%j==0){
                    p=j;
                    if(a!=p){
                        break;
                    }
                    else{
                        count++;
                    }
                }
            }
        }System.out.print(count);
    }
}
