import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 총 카드 수
        int M = sc.nextInt(); // 앞면에 O가 있는 카드 수
        int K = sc.nextInt(); // 뒷면에 O를 적을 카드 수

        int sameO = Math.min(M, K);
        int sameX = Math.min(N - M, N - K);

        System.out.println(sameO + sameX);
    }
}
