import java.io.*;

public class GroupWordChecker {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException {

        int n=Integer.parseInt(br.readLine());
        int count=0;

        for(int i=0;i<n;i++){
            if(check()){
                count++;
            }
        }br.close();
        System.out.print(count);
    }
    public static boolean check() throws IOException{
        boolean[]check=new boolean[26];
        int prev=0;
        String s=br.readLine();

        for(int i=0;i<s.length();i++){
            int now=s.charAt(i);

            if(prev!=now){
                if(check[now-'a']==false){
                    check[now-'a']=true;
                    prev=now;
                }
                else return false; //함수종료(그룹단어 아니므로)
            }else continue; //연속된 문자일경우 else문 필요없음
        }return true;
    }
}