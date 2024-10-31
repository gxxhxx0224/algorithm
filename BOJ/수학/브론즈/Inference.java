import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 처리
        int N = scanner.nextInt();
        int[] sequence = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }
        
        // 공차와 공비 계산
        int diff = sequence[1] - sequence[0];
        int ratio = sequence[1] / sequence[0];
        
        // 수열이 등차수열인지 확인
        boolean isArithmetic = true;
        for (int i = 1; i < N; i++) {
            if (sequence[i] - sequence[i - 1] != diff) {
                isArithmetic = false;
                break;
            }
        }
        
        // 등차수열이라면 다음 항 계산
        if (isArithmetic) {
            int nextTerm = sequence[N - 1] + diff;
            System.out.println(nextTerm);
        } else { // 등비수열이라면 다음 항 계산
            int nextTerm = sequence[N - 1] * ratio;
            System.out.println(nextTerm);
        }
        
        scanner.close();
    }
}
