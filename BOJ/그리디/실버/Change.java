import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Change {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n > 0) {
            if (n % 5 != 0){
                n-=2;
                count++;
            }
            else{
                count += n / 5;
                n=0;
            }

            if(n<0)
                count=-1;
        }
        System.out.print(count);
    }
}
