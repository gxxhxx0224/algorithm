import java.io.*;
import java.util.*;

//7490 0 만들기
public class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine()); //테스트 케이스의 수
        sb=new StringBuilder();

        for(int tc=1;tc<=t;tc++){
            int n=Integer.parseInt(br.readLine());
            dfs(n,1,1,1,0,"1");
            sb.append("\n");
        }
        System.out.print(sb);
    }
    public static void dfs(int max,int now,int num,int op, int sum,String str){
        if(max==now){
            sum+=(num*op);
            if(sum==0){
                sb.append(str+"\n");
            }
            return;
        }
        dfs(max,now+1,num*10+now+1,op,sum,str+" "+(now+1));
        dfs(max,now+1,now+1,1,sum+(num*op),str+"+"+(now+1));
        dfs(max,now+1,now+1,-1,sum+(num*op),str+"-"+(now+1));
    }
}
