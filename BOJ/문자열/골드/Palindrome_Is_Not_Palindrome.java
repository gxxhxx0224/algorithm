import java.io.*;
import java.util.*;

//15927 회문은 회문이 아니야!!
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();

        if(palindrome(str)){
            if(allSame(str))
                System.out.print(-1);
            else
                System.out.print(str.length()-1);
        }
        else{
            System.out.print(str.length());
        }
    }
    public static boolean allSame(String str){
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)) return false;
        }
        return true;
    }
    public static boolean palindrome(String str){
        int from=0;
        int to=str.length()-1;
        while(from<to){
            if(str.charAt(from)==str.charAt(to)){
                from++;
                to--;
            }
            else return false;
        }
        return true;
    }
}
