import java.util.*;
import java.io.*;

public class Main {
    static int n, parents[];
    static ArrayList<Cable> cables = new ArrayList<>();

    static void makeSet() {
        parents = new int[n + 1];
        for (int i = 1; i <= n; i++)
            parents[i] = i;
    }

    static int find(int x) {
        if (parents[x] == x) return x;
        else return parents[x] = find(parents[x]);
    }

    static boolean union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            if (a < b) parents[b] = a;
            else parents[a] = b;
        } else return false;
        return true;
    }
    static class Cable implements Comparable<Cable> {
        int from, to, cost;

        public Cable(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Cable o) {
            return Integer.compare(this.cost, o.cost);
        }
    }
    static int solve(){
        makeSet();
        Collections.sort(cables);

        int totalCost=0;
        int cnt=0;
        for(Cable now: cables){
            int from=now.from;
            int to=now.to;
            int cost=now.cost;

            if(union(from,to)){
                totalCost+=cost;
                cnt++;

                if(cnt==n-1) break;
            }
        }
        if(cnt==n-1) return totalCost;
        return -1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int totalCable=0;
        for (int i = 1; i <= n; i++) {
            String input = br.readLine();

            for (int j = 1; j <= n; j++) {
                char c = input.charAt(j - 1);
                if(c=='0') continue;

                if (Character.isUpperCase(c)) {
                    cables.add(new Cable(i, j, c - 'A' + 27));
                    totalCable+=c-'A'+27;
                }
                else {
                    cables.add(new Cable(i, j, c - 'a' + 1));
                    totalCable+=c-'a'+1;
                }
            }
        }
        int ans=solve();

        if(ans==-1) System.out.println(ans);
        else System.out.println(totalCable-ans);
    }
}
