import java.io.*;
import java.util.*;

public class Main {
    static int n, arr[][];
    static boolean check[][][][];
    static String[] str;
    static HashSet<Long> hs;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        str = new String[]{"I", "V", "X", "L"};
        hs = new HashSet<>();
        check=new boolean[n+1][n+1][n+1][n+1];

        dfs(0,n,n,n,n,0L);
        System.out.print(hs.size());
    }

    public static void dfs(int depth, int I, int V, int X, int L, Long num) {
        if(check[I][V][X][L]) return;
        check[I][V][X][L]=true;

        if(depth==n){
            hs.add(num);
            return;
        }

        if (I >= 1) dfs(depth + 1, I - 1, V, X, L, num + 1);
        if (V >= 1) dfs(depth + 1, I, V - 1, X, L, num + 5);
        if (X >= 1) dfs(depth + 1, I, V, X - 1, L, num + 10);
        if (L >= 1) dfs(depth + 1, I, V, X, L - 1, num + 50);
    }
}
