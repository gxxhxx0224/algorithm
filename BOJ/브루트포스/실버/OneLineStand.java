import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//BruteForce
public class OneLineStand {
    static int n;
    static int arr[],test[];
    static boolean check[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr=new int[n]; //키가 i인 사람보다, 왼쪽에 섰응면서 더 큰사람 수
        test=new int[n]; //조합의 경우의 수를 담을 배열
        check=new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) arr[i]=Integer.parseInt(st.nextToken());
        
        dfs(0);

        System.out.println(sb);
    }

    public static boolean search(){
        for(int i=0;i<n;i++){ //나보다
            int count=0;
            for(int j=0;j<i;j++){ //왼쪽인 경우
                if(test[j]>test[i]){
                    count++;
                }
            }

            //실제 배치된 사람의 키: test[i]순이므로,
            //arr[i]가 아닌, arr[test[i]]이다.
            if(count!=arr[test[i]-1]) return false;
        }
        return true;
    }

    public static void dfs(int depth){
        if(depth==n){
            if(search()){
                for(int i=0;i<n;i++){
                    sb.append(test[i]+" ");
                }
                return;
            }
            return;
        }

        for(int i=0;i<n;i++){ //나보다
            if(!check[i]){
                check[i]=true;
                test[depth]=i+1;
                dfs(depth+1);
                check[i]=false;
            }
        }
    }
}
