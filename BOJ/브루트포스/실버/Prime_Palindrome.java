import java.io.*;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());

        for(int num=n;num<=Integer.MAX_VALUE;num++){
            if(palindrome(num) && prime(num)){
                System.out.print(num);
                return;
            }
        }
    }
    public static boolean prime(int num){
        if(num==1) return false;

        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static boolean palindrome(int num){
        String str=String.valueOf(num);
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
            reverse+=str.charAt(i);

        if(str.equals(reverse)) return true;

        return false;
    }
}
