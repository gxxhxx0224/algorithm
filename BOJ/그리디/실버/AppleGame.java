import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class AppleGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //스크린의 칸
        int m = Integer.parseInt(st.nextToken()); //바구니의 칸
        int j = Integer.parseInt(br.readLine()); //사과 개수

        int left=1; //내 위치의 왼쪽 인덱스
        int right=m; //오른쪽 인덱스
        int distance = 0; //총 이동거리

        for (int i = 1; i <= j; i++) {
            int apple = Integer.parseInt(br.readLine()); //사과가 떨어지는 위치

            if (apple > right) { //오른쪽으로 이동하는 경우
                distance += apple - right;
                left+=apple-right;
                right=apple;
            }
            else if(apple<left){
                distance+=left-apple;
                right-=left-apple;
                left=apple;
            }
        }
        System.out.print(distance);
    }
}
