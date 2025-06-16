import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int changScore = 100;  // 창영이 초기 점수
        int sangScore = 100;   // 상덕이 초기 점수

        int n = sc.nextInt();  // 라운드 수 입력

        for (int i = 0; i < n; i++) {
            int chang = sc.nextInt();  // 창영이 주사위 값
            int sang = sc.nextInt();   // 상덕이 주사위 값

            if (chang > sang) {
                sangScore -= chang;  // 창영이 승리 → 상덕이 점수 차감
            } else if (chang < sang) {
                changScore -= sang;  // 상덕이 승리 → 창영이 점수 차감
            }
            // 같을 경우는 아무 점수 변화 없음
        }

        System.out.println(changScore);
        System.out.println(sangScore);
    }
}
