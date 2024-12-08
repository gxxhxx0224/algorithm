import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 수열 생성
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = 1; sequence.size() < B; i++) {
            for (int j = 0; j < i; j++) {
                sequence.add(i);
            }
        }

        // 구간 합 계산
        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += sequence.get(i);
        }

        // 결과 출력
        System.out.println(sum);

        sc.close();
    }
}
