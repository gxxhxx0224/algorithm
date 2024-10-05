import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();

        String s="";
        boolean minus=false;
        int ans=0;

        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);

            if(Character.isDigit(c)){
                s+=c;
            }
            else{
                if(!minus) {
                    ans+=Integer.parseInt(s);
                    s="";
                }
                else {
                    ans-=Integer.parseInt(s);
                    s="";
                }

                if(c=='-') minus=true;
            }
        }
        if(!s.isEmpty()){
            if(minus) ans-=Integer.parseInt(s);
            else ans+=Integer.parseInt(s);
        }
        System.out.println(ans);
    }
}
