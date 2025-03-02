import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim()); // 상금 입력 받기

        int case1 = N - (N * 22 / 100); // 1번 경우: 전체 상금의 22% 공제
        int case2 = N - ((N * 20 / 100) * 22 / 100); // 2번 경우: 80% 필요 경비 인정

        System.out.println(case1 + " " + case2);
    }
}
