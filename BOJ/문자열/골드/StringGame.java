import java.io.*;
import java.util.*;

//20437 문자열 게임 2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine()); //게임 수

        for(int tc=1;tc<=t;tc++){
            String w=br.readLine(); //문자열
            int k=Integer.parseInt(br.readLine()); //어떤 문자를 포함하는 수

            if(k==1){
                System.out.println(1+" "+1);
                continue;
            }

            int alp[]=new int[26];
            for(int i=0;i<w.length();i++){
                alp[w.charAt(i)-'a']++; //문자열의 각 알파벳 개수 카운팅
            }

            int min=Integer.MAX_VALUE; //가장 짧은 길이
            int max=-1; //가장 긴 길이

            for(int i=0;i<w.length();i++){
                if(alp[w.charAt(i)-'a']<k) continue;
                int count=1;

                for(int j=i+1;j<w.length();j++){
                    if(w.charAt(i)==w.charAt(j)) count++; //같으면 카운팅

                    if(count==k){
                        //j-i+1: 길이
                        min=Math.min(min,j-i+1);
                        max=Math.max(max,j-i+1);
                        break;
                    }
                }
            }
            if(max==-1 || min==Integer.MAX_VALUE) System.out.println(-1);
            else System.out.println(min+" "+max);
        }
    }
}
