import java.io.*;
import java.util.*;

//1522 S1 '문자열 교환'- 슬라이딩 윈도우
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();

        int a=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a') a++;
        }

        //첫번째 슬라이드
        int b=0;
        for(int i=0;i<a;i++)
            if(str.charAt(i)=='b') b++;

        int min=b;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)=='b') b--;
            if(str.charAt((i+a-1)%str.length())=='b') b++;

            min=Math.min(min,b);
        }
        System.out.print(min);
    }
}
