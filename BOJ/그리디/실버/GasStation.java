import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GasStation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //도시의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int km[] = new int[n - 1]; //주유소 사이의 각 거리
        int totalDistance = 0; //총 남은거리
        for (int i = 0; i < km.length; i++) {
            km[i] = Integer.parseInt(st.nextToken());
            totalDistance += km[i];
        }

        st = new StringTokenizer(br.readLine());
        int price[] = new int[n];
        int min = 1000000001; //최소가격
        int minIdx = 0;
        for (int i = 0; i < n - 1; i++) {//제일 끝칸에선 주유 안하므로
            price[i] = Integer.parseInt(st.nextToken());
            if (min > price[i]) {
                min = price[i];
                minIdx = i;
            }
        }

        int totalPrice = 0;

        for (int i = 0; i < n - 1; i++) {
            if (i == minIdx) { //최소가격일때 남은 거리만큼 다 주유해버린다 
                totalPrice += price[i] * totalDistance;
                break;
            }
            else if (i == 0 || i!=minIdx) { //첫출발 이거나 아직 최소가격 안나온 경우
                totalPrice += price[i] * km[i]; //다음 주유소 거리만큼 주유
                totalDistance -= km[i];
            } 
        }
        System.out.print(totalPrice);
    }
}
