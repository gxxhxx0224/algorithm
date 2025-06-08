import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        long sum = (long) N * (N + 1) / 2;       // 1부터 N까지의 합
        long square = sum * sum;                // 그 합의 제곱
        long cubeSum = 0;

        for (int i = 1; i <= N; i++) {
            cubeSum += (long) i * i * i;        // 1^3 + 2^3 + ... + N^3
        }

        System.out.println(sum);
        System.out.println(square);
        System.out.println(cubeSum);
    }
}
