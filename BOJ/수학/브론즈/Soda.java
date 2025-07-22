import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt(); // 가지고 있는 빈 병
        int f = sc.nextInt(); // 발견한 빈 병
        int c = sc.nextInt(); // 새 병 하나 받는데 필요한 빈 병 수

        int total = e + f; // 총 빈 병 수
        int drinks = 0;

        while (total >= c) {
            int newDrinks = total / c; // 교환 가능한 새 병 수
            drinks += newDrinks;       // 총 마신 음료 수에 추가
            total = total % c + newDrinks; // 남은 병 + 새로 생긴 빈 병
        }

        System.out.println(drinks);
    }
}
