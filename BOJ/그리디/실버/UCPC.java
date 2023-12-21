import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UCPC{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        boolean check[]=new boolean[4];
        String str="";

        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);

            if(c=='U' && !check[0]) {
                str += c;
                check[0]=true;
            }
            else if(c=='C' && check[0] && !check[1]) {
                str += c;
                check[1]=true;
            }
            else if(c=='P' && check[1] && !check[2]) {
                str += c;
                check[2]=true;
            }
            else if(c=='C' && check[2] && !check[3]) {
                str += c;
                check[3]=true;

                System.out.println("I love UCPC");
                break;
            }
        }
        if(!str.equals("UCPC"))
            System.out.println("I hate UCPC");
    }
}
