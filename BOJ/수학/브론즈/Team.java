import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 이동해야 하는 거리 입력
        int L = sc.nextInt();

        // 최소 시간 계산 (5로 나눈 몫 + 나머지가 있으면 +1)
        int time = L / 5 + (L % 5 == 0 ? 0 : 1);

        // 결과 출력
        System.out.println(time);

        sc.close();
    }
}
