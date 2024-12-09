import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        int S1 = scanner.nextInt();
        int S2 = scanner.nextInt();
        int S3 = scanner.nextInt();

        // 합의 빈도를 저장하는 배열 생성 (최대 합은 S1 + S2 + S3)
        int maxSum = S1 + S2 + S3;
        int[] sumFrequency = new int[maxSum + 1];

        // 세 주사위의 모든 합 계산
        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    int sum = i + j + k;
                    sumFrequency[sum]++;
                }
            }
        }

        // 최대 빈도를 찾고 해당하는 가장 작은 합 구하기
        int maxFrequency = 0;
        int resultSum = 0;

        for (int i = 3; i <= maxSum; i++) { // 최소 합은 3
            if (sumFrequency[i] > maxFrequency) {
                maxFrequency = sumFrequency[i];
                resultSum = i;
            }
        }

        // 결과 출력
        System.out.println(resultSum);
    }
}
