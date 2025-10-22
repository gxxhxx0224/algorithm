import java.util.*;
import java.io.*;

//18111 S2 '마인크래프트'
//35272kb, 584ms
public class Main {
    static int n, m, b, blocks[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //세로
        m = Integer.parseInt(st.nextToken()); //가로
        b = Integer.parseInt(st.nextToken()); //인벤토리에 있는 블록 수

        blocks = new int[n * m];
        int idx = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                blocks[idx] = Integer.parseInt(st.nextToken());

                min = Math.min(min, blocks[idx]);
                max = Math.max(max, blocks[idx]);

                idx++;
            }
        }

        int maxHeight = -1;
        int time = Integer.MAX_VALUE;
        for (int floor = min; floor <= max; floor++) {
            int a[] = solve(floor);

            if (time >= a[0]) {
                time = Math.min(time, a[0]);
                maxHeight = a[1];
            }
        }
        System.out.print(time + " " + maxHeight);
    }

    static int[] solve(int floor) { //목표 층
        int a[] = new int[2];
        int inben = b;
        int time = 0;

        for (int i = 0; i < n * m; i++) {
            if(blocks[i]>floor){ //해당 블록 빼서 인벤토리에 넣기
                int diff=blocks[i]-floor;

                time+=diff*2;
                inben+=diff;
            }else if(blocks[i]<floor){ //인벤토리에서 빼서 블록쌓기
                int diff=floor-blocks[i];
                
                inben-=(diff);
                time+=(diff);
            }
        }
        if(inben<0){ //구할 수 없음 ㅇㅇ
            a[0]=Integer.MAX_VALUE;
            a[1]=-1;
        }
        else {
            a[0] = time;
            a[1] = floor;
        }
        return a;
    }
}
