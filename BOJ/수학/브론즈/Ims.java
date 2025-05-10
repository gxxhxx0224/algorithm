import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chickenAvailable = sc.nextInt(); // 치킨집에 있는 치킨 개수 N
        int coke = sc.nextInt(); // 콜라 개수 A
        int beer = sc.nextInt(); // 맥주 개수 B

        // 콜라 2개당 치킨 1마리 가능 => coke / 2
        int maxChickenByDrinks = (coke / 2) + beer;

        // 실제로 시켜먹을 수 있는 치킨은 치킨집에 있는 수를 넘을 수 없다
        int result = Math.min(chickenAvailable, maxChickenByDrinks);

        System.out.println(result);
    }
}
