import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 초기 온도
        int B = sc.nextInt(); // 목표 온도
        int C = sc.nextInt(); // 얼은 고기 1도 올리는 시간
        int D = sc.nextInt(); // 해동 시간
        int E = sc.nextInt(); // 비냉동 고기 1도 올리는 시간

        int time = 0;

        if (A < 0) {
            // 얼은 고기 상태에서 0도까지 데우기
            time += (-A) * C;
            // 해동 시간
            time += D;
            // 0도에서 목표 온도까지 비냉동 가열
            time += B * E;
        } else if (A == 0) {
            // 해동 시간
            time += D;
            // 0도에서 목표 온도까지 비냉동 가열
            time += B * E;
        } else {
            // A > 0 : 비냉동 상태로 바로 가열
            time += (B - A) * E;
        }

        System.out.println(time);
    }
}
