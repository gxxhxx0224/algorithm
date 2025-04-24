import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(); // 행의 개수
        int W = sc.nextInt(); // 열의 개수
        int N = sc.nextInt(); // 세로 거리두기 기준
        int M = sc.nextInt(); // 가로 거리두기 기준

        // (N+1) 행 간격마다 한 명, (M+1) 열 간격마다 한 명 앉을 수 있음
        int rowCount = (H + N) / (N + 1);
        int colCount = (W + M) / (M + 1);

        int answer = rowCount * colCount;
        System.out.println(answer);
    }
}
