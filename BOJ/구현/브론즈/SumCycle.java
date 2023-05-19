import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumCycle{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n=Integer.parseInt(br.readLine());
        
        int x=n;
        int count=0;
        
        do{
            n=((n%10)*10)+((n/10)+(n%10))%10;
            count++;
            }
        while(n!=x);
        bw.write(count+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
