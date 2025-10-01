import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0;
        
        for(int w=1; w<=n; w++){
            for(int h=w; h*w<=n; h++){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
