import java.util.Scanner;

public class VacationHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(); // 방학 일수
        int A = sc.nextInt(); // 국어 총 페이지 수
        int B = sc.nextInt(); // 수학 총 페이지 수
        int C = sc.nextInt(); // 하루 최대 국어 페이지 수
        int D = sc.nextInt(); // 하루 최대 수학 페이지 수

        int daysKorean = (int) Math.ceil((double) A / C);
        int daysMath = (int) Math.ceil((double) B / D);

        int maxDays = Math.max(daysKorean, daysMath);
        int freeDays = L - maxDays;

        System.out.println(freeDays);
    }
}
