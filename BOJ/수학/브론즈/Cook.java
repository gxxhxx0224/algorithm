import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int winner = 0;  // 우승자 번호
        int maxScore = 0; // 최고 점수
        
        // 5명의 참가자 점수 입력 및 계산
        for (int i = 1; i <= 5; i++) {
            int sum = 0; // 현재 참가자의 총점
            
            // 4개의 평가 점수 입력 및 합산
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }
            
            // 최고 점수 갱신
            if (sum > maxScore) {
                maxScore = sum;
                winner = i;
            }
        }
        
        sc.close();
        
        // 우승자와 점수 출력
        System.out.println(winner + " " + maxScore);
    }
}
