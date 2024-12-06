import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int g=Integer.parseInt(st.nextToken()); //찾으려는 단어 W의 길이
        int s=Integer.parseInt(st.nextToken()); //문자열 S의 길이

        String W=br.readLine();
        String S=br.readLine();

        int wArr[]=new int[52];
        int sArr[]=new int[52];

        for(int i=0;i<W.length();i++){
            char c=W.charAt(i);

            set(c,wArr,1);
        }

        int size=0;
        int ans=0;
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            set(c,sArr,1);
            size++;

            if(size==W.length()){
                if(Arrays.equals(wArr,sArr)){
                    ans++;
                }
                size--;
                set(S.charAt(i+1-W.length()),sArr,-1);
            }
        }
        System.out.print(ans);
    }
    public static void set(char c, int[] arr, int val){
        if(c>='a' && c<='z')
            arr[c-'a']+=val;
        else
            arr[c-'A'+26]+=val;
    }
}
