import java.io.*;

//12919 A와B 2
public class Main {
    static boolean check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        dfs(s,t);

        if(check) System.out.print(1);
        else System.out.print(0);
    }
    public static void dfs(String s,String t){
        if(s.length()==t.length()){
            if(s.equals(t))
                check=true;
            return;
        }

        if(t.charAt(t.length()-1)=='A')
            dfs(s,t.substring(0,t.length()-1));
        if(t.charAt(0)=='B'){
            String reverse="";
            for(int i=t.length()-1;i>0;i--){
                reverse+=t.charAt(i);
            }
            dfs(s,reverse);
        }

    }
}

