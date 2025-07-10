import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < t; i++) {
            long c = sc.nextLong(); // 사탕 개수
            long v = sc.nextLong(); // 형제 수

            long each = c / v;      // 형제에게 주는 개수
            long dad = c % v;       // 아부지에게 남는 개수

            System.out.println("You get " + each + " piece(s) and your dad gets " + dad + " piece(s).");
        }
    }
}
