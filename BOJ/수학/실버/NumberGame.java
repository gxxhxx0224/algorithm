import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 사람의 수
        int winner = 0; // 승자의 번호
        int maxLastDigit = -1; // 가장 큰 일의 자리 수

        for (int i = 1; i <= N; i++) {
            int[] cards = new int[5];
            for (int j = 0; j < 5; j++) {
                cards[j] = scanner.nextInt();
            }

            // 세 장의 카드를 선택하여 합의 일의 자리 수 계산
            int maxCurrent = 0;
            for (int a = 0; a < 5; a++) {
                for (int b = a + 1; b < 5; b++) {
                    for (int c = b + 1; c < 5; c++) {
                        int sum = cards[a] + cards[b] + cards[c];
                        int lastDigit = sum % 10;
                        maxCurrent = Math.max(maxCurrent, lastDigit);
                    }
                }
            }

            // 최대 일의 자리 수 갱신 및 승자 번호 업데이트
            if (maxCurrent > maxLastDigit || (maxCurrent == maxLastDigit && i > winner)) {
                maxLastDigit = maxCurrent;
                winner = i;
            }
        }

        System.out.println(winner); // 결과 출력
    }
}
