import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PrinterQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); //문서의 개수
            int m = Integer.parseInt(st.nextToken()); //몇번째인지 궁금한 문서의 위치

            Queue<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine()); //문서의 중요도

            for (int i = 0; i < n; i++) {
                q.add(new int[]{Integer.parseInt(st.nextToken()),i});
            }

            int ans=-1;
            int count=0;

            while(!q.isEmpty()) {
                int max=0;
                for(int i=0;i<q.size();i++){
                    int a[]=q.poll();
                    max=Math.max(max,a[0]);
                    q.add(a);
                }

                for(int i=0;i<q.size();i++){
                    if(max>q.peek()[0]){
                        int temp[]=q.poll();
                        q.add(temp);
                    }else{
                        int a[]=q.poll();
                        count++;

                        if(a[1]==m){
                            ans=count;
                            break;
                        }
                        break;
                    }
                }
                if(ans==count) break;
            }
            System.out.println(ans);
        }

    }
}
