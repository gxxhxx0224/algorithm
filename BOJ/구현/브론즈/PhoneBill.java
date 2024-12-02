import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();  // 통화 시간의 개수
        int[] callTimes = new int[N];

        // 각 통화 시간 배열에 입력
        for (int i = 0; i < N; i++) {
            callTimes[i] = sc.nextInt();
        }

        // 영식 요금제 계산 (30초마다 10원)
        int yCost = 0;
        for (int time : callTimes) {
            yCost += ((time / 30) + 1) * 10;  // 30초마다 10원씩 부과
        }

        // 민식 요금제 계산 (60초마다 15원)
        int mCost = 0;
        for (int time : callTimes) {
            mCost += ((time / 60) + 1) * 15;  // 60초마다 15원씩 부과
        }

        // 결과 출력
        if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else if (mCost < yCost) {
            System.out.println("M " + mCost);
        } else {
            System.out.println("Y M " + yCost);
        }

        sc.close();
    }
}
