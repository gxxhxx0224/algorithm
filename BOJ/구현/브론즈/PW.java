import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 열 개수 K 입력
        int k = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        // 암호화된 문자열 입력
        String encrypted = scanner.nextLine();

        // 행의 개수 계산
        int rows = encrypted.length() / k;

        // 2D 배열로 문자열 재구성
        char[][] grid = new char[rows][k];
        boolean reverse = false;
        int index = 0;

        for (int i = 0; i < rows; i++) {
            if (reverse) {
                for (int j = k - 1; j >= 0; j--) {
                    grid[i][j] = encrypted.charAt(index++);
                }
            } else {
                for (int j = 0; j < k; j++) {
                    grid[i][j] = encrypted.charAt(index++);
                }
            }
            reverse = !reverse;
        }

        // 원래 문자열 재구성
        StringBuilder original = new StringBuilder();
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < rows; i++) {
                original.append(grid[i][j]);
            }
        }

        // 결과 출력
        System.out.println(original.toString());
    }
}
