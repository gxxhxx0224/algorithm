import java.util.*;
import java.io.*;

//13335 S1 '트럭'
//14796kb, 180ms
public class Main {
    static int n, width, limit;
    static List<Truck> trucks;

    static class Truck {
        int weigh, length;

        public Truck(int weigh, int length) {
            this.weigh = weigh;
            this.length = length;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); //트럭개수
        width = Integer.parseInt(st.nextToken()); //다리길이
        limit = Integer.parseInt(st.nextToken()); //최대하중

        trucks = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trucks.add(new Truck(Integer.parseInt(st.nextToken()), width));
        }
        System.out.println(solve());
    }

    public static int solve() {
        int time = 0;

        int weigh = 0;
        int count = 0; //다리 위 트럭 수
        int remain = n; //전체 트럭 수
        int inLine = 0; //다리 건널 트럭 인덱스

        while (true) {
            if (remain == 0) break;

            time++;

            //이미 다리위에 있는 트럭들 건너기
            for (int i = 0; i < inLine; i++) {
                int now = --trucks.get(i).length;

                if (now == 0) { //다 건넜으면
                    weigh -= trucks.get(i).weigh;
                    count--;
                    remain--;
                    trucks.get(i).length=-1; //건넘 처리
                }

            }

            //새로 다리위로 들어올 트럭
            //다리에 자리가 있고, 하중도 버틸 수 있으면
            if (inLine < n && count + 1 <= width && weigh + trucks.get(inLine).weigh <= limit) {
                weigh += trucks.get(inLine).weigh;
                count++;
                inLine++;
            }
        }
        return time;
    }
}
