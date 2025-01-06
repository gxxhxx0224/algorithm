import java.io.*;
import java.util.*;

//17609 회문
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine()); //문자열 개수

        for(int tc=1;tc<=t;tc++){
            String str=br.readLine();

            int left=0;
            int right=str.length()-1;

            System.out.println(palindrome(left,right,str,0));
        }
    }
    public static int palindrome(int left,int right, String str, int count){
        if(count>=2) return 2;

        while(left<right){
            int mid=(left+right)/2;

            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }
            else return Math.min(palindrome(left+1,right,str,count+1),palindrome(left,right-1,str,count+1));
        }
        return count;
    }
}
