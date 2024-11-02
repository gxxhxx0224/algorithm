import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[8][8];
        
        // 체스판 입력
        for (int i = 0; i < 8; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 8; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int count = 0;
        
        // 하얀 칸 위의 말 세기
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // (i + j) % 2 == 0 이면 하얀 칸
                if ((i + j) % 2 == 0 && board[i][j] == 'F') {
                    count++;
                }
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
