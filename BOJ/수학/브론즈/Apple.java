import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 학교 수
        int totalLeft = 0; // 남는 사과 개수 총합

        for (int i = 0; i < N; i++) {
            int students = sc.nextInt(); // 학생 수
            int apples = sc.nextInt(); // 배정된 사과 개수
            totalLeft += apples % students; // 남는 사과 개수 누적
        }

        System.out.println(totalLeft); // 결과 출력
        sc.close();
    }
}
