import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 여학생 수
        int M = sc.nextInt(); // 남학생 수
        int K = sc.nextInt(); // 인턴 참여 인원

        int team = 0;

        // 인턴을 고려해 최대 팀 수 계산
        while (N >= 2 && M >= 1 && N + M - K >= 3) {
            N -= 2;
            M -= 1;
            team++;
        }

        System.out.println(team);
    }
}
