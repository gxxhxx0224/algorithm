import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        StringBuilder sb = new StringBuilder();

        int cnt[]=new int[26];

        //문자열의 알파벳을 카운트
        for(int i=0;i<input.length();i++){
            char C=input.charAt(i);

            cnt[C-65]++;
        }
        //홀수개 알파벳은 0~1개여야함.
        StringBuilder front=new StringBuilder();
        StringBuilder back=new StringBuilder();

        //오름차순 정렬이니까 cnt[0~26] 순으로 걍 다 더함
        int oddCheck=0;
        boolean check=true;
        String mid="";

        for(int i=0;i<26;i++){
            if(cnt[i]%2==1){
                oddCheck++;

                if(oddCheck>1){
                    check=false;
                    break;
                }
                mid+=(char)(i+65);
            }

            for(int j=0;j<cnt[i]/2;j++){
                front.append((char)(i+65));
                back.insert(0,(char)(i+65));
            }
        }
        if(!check) sb.append("I'm Sorry Hansoo");
        else sb.append(front+mid+back);

        System.out.println(sb);
    }
}
