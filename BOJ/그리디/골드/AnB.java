import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnB {
    static int length,ans;
    static String s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s=br.readLine();
        String t=br.readLine();

        length=s.length();
        ans=0;
        //연산1: 문자열 뒤의 A를 뺀다
        //연산2: 문자열 뒤의 B를 빼고, 문자열을 뒤집는다.

        int length=t.length();

        while(length>s.length()){
            if(t.charAt(t.length()-1)=='A'){
                t=t.substring(0,t.length()-1);
                length--;
            }
            else{
                t=t.substring(0,t.length()-1);
                String rvs="";
                for(int i=t.length()-1;i>=0;i--){
                    rvs+=t.charAt(i);
                }
                t=rvs;
                length--;
            }
        }

        if(t.equals(s)) ans=1;

        System.out.print(ans);
    }
}
