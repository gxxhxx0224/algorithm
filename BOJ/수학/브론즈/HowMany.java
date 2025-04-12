import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 시간
        int S = sc.nextInt(); // 술 여부

        if (T >= 12 && T <= 16 && S == 0) {
            System.out.println(320); // 점심 시간이고 술 없이
        } else {
            System.out.println(280); // 나머지 모든 경우
        }
    }
}
