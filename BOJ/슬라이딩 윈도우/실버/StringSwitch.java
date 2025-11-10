import java.io.*;
import java.util.*;

//1522 S1 '문자열 교환'
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();

        //a의 길이 구하기
        int aCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') aCount++;
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            int bCount=0;
            for(int j=i;j<aCount+i;j++){
                //a길이 만큼에서 들어가는 b의 최소 길이=교환회수의 최소값
                if(s.charAt(j%s.length())=='b') bCount++;
            }
            min=Math.min(min,bCount);
        }
        System.out.print(min);
    }
}
