import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int M = sc.nextInt(); // 남자 친구 수
            int F = sc.nextInt(); // 여자 친구 수

            if (M == 0 && F == 0) {
                break; // 종료 조건
            }

            System.out.println(M + F); // 친구 총합 출력
        }

        sc.close();
    }
}
