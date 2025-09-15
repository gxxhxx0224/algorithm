import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트케이스 수
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            long N = sc.nextLong(); // 쿠키 개수
            long C = sc.nextLong(); // 하루에 먹는 개수

            long days = (N + C - 1) / C; // 올림 나눗셈
            sb.append(days).append("\n");
        }

        System.out.print(sb);
        sc.close();
    }
}
