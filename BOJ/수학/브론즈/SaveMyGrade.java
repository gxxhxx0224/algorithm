import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 학기 수
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // 과목 수
            int totalCredits = 0;
            double totalScore = 0.0;

            for (int i = 0; i < N; i++) {
                int C = sc.nextInt();       // 학점
                double G = sc.nextDouble(); // 성적
                totalCredits += C;
                totalScore += C * G;
            }

            double gpa = totalScore / totalCredits;
            System.out.printf("%d %.1f\n", totalCredits, gpa);
        }

        sc.close();
    }
}
