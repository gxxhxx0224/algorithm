import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int L = scanner.nextInt();
        int P = scanner.nextInt();
        
        int actualParticipants = L * P; // 실제 참가자 수 계산
        
        int[] reportedParticipants = new int[5];
        for (int i = 0; i < 5; i++) {
            reportedParticipants[i] = scanner.nextInt();
        }
        
        // 결과 출력
        for (int i = 0; i < 5; i++) {
            System.out.print((reportedParticipants[i] - actualParticipants) + " ");
        }
        
        scanner.close();
    }
}
