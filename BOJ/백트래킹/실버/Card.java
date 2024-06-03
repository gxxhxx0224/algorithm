import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Card {
    static int n,k,num[],arr[];
    static boolean check[];
    static HashSet<String>hs=new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine()); //카드의 개수
        k=Integer.parseInt(br.readLine()); //선택할 카드 수
        num=new int[n];
        arr=new int[k];
        check=new boolean[n];

        for(int i=0;i<n;i++)
            num[i]=Integer.parseInt(br.readLine());

        dfs(0);

        System.out.println(hs.size());

    }
    public static void dfs(int depth){

        if(depth==k){
            String str="";
            for(int val:arr){
                str+=val;
            }hs.add(str);
            return;
        }

        for(int i=0;i<n;i++){
            if(!check[i]){
                check[i]=true;
                arr[depth]=num[i];
                dfs(depth+1);
                check[i]=false;
            }
        }
    }
}
