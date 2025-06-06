import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long R = sc.nextLong();  // 행 수
        long C = sc.nextLong();  // 열 수
        long N = sc.nextLong();  // CCTV 한 변의 길이

        long rowCCTV = (R + N - 1) / N;
        long colCCTV = (C + N - 1) / N;

        System.out.println(rowCCTV * colCCTV);
    }
}
