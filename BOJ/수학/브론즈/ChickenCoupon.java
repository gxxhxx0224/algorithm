import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt(); // 쿠폰 개수
            int k = sc.nextInt(); // 도장 k개 → 쿠폰 1장

            int total = n; // 먹은 치킨 마리 수
            int stamp = n; // 받은 도장 수 == 처음 먹은 치킨 수

            while (stamp >= k) {
                int newCoupons = stamp / k;
                total += newCoupons;
                stamp = stamp % k + newCoupons;
            }

            System.out.println(total);
        }

        sc.close();
    }
}
