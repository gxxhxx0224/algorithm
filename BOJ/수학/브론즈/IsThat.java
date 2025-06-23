import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 표 입력받기
        int[][] matrix = new int[2][2];
        matrix[0][0] = sc.nextInt(); // A
        matrix[0][1] = sc.nextInt(); // B
        matrix[1][0] = sc.nextInt(); // C
        matrix[1][1] = sc.nextInt(); // D

        int maxIndex = 0;
        double maxValue = getValue(matrix);

        // 3번 회전 (90도씩)
        for (int i = 1; i <= 3; i++) {
            matrix = rotate90(matrix);
            double value = getValue(matrix);

            if (value > maxValue) {
                maxValue = value;
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);
    }

    // 표의 값 계산: A/C + B/D
    private static double getValue(int[][] m) {
        return (double) m[0][0] / m[1][0] + (double) m[0][1] / m[1][1];
    }

    // 90도 시계방향 회전
    private static int[][] rotate90(int[][] m) {
        return new int[][] {
            { m[1][0], m[0][0] },
            { m[1][1], m[0][1] }
        };
    }
}
