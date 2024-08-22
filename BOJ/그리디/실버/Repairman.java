import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Repairman {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //물이 새는 곳 개수
        int l = Integer.parseInt(st.nextToken()); //테이프의 길이
        int count = 0;
        float arr[] = new float[n];

        //첫번째에 -0.5 + l.
        // 그 값이 다음값-0.5와 겹친다면 이어서 붙이기
        //아니면 다시 따로 ㄱㄱ
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Float.parseFloat(st.nextToken());
        }
        Arrays.sort(arr);

        float now = arr[0] - 0.5F + (float) (l);
        count++;

        for (int i = 1; i < n; i++) {
            //테이프가 다음구멍 뒤까지 막아버리는 경우
            if (now >= arr[i] + 0.5F) continue;

            //테이프가 다음구멍 앞까진 닿고, 뒤까진 안오는 경우
            else if (now >= arr[i] - 0.5F) {
                now += (float) (l); //이어붙인다
                count++;
            } else { //테이프가 다음구멍 앞까지도 안오는 경우
                now = arr[i] - 0.5F + (float) (l); //다음구멍 앞부터 붙인다
                count++;
            }
        }
        System.out.print(count);
    }
}
