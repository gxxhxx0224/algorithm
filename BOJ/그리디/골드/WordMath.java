import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[26];

        for(int i=0;i<n;i++){
            String str=br.readLine();

            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);

                arr[c-'A']+=Math.pow(10,str.length()-1-j);
            }
        }
        Arrays.sort(arr);

        int num=9;
        int ans=0;
        for(int i=25;i>=0;i--){
            if(arr[i]!=0){
                ans+=arr[i]*num;
                num--;
            }
        }
        System.out.print(ans);
    }
}
