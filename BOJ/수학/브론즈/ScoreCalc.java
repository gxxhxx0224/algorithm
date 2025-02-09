import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 문제 개수
        int score = 0, streak = 0;
        
        for (int i = 0; i < N; i++) {
            int result = sc.nextInt(); // 각 문제의 채점 결과
            if (result == 1) {
                streak++;
                score += streak;
            } else {
                streak = 0;
            }
        }
        
        System.out.println(score);
        sc.close();
    }
}
