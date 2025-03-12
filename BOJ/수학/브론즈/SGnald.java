import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 개의 햄버거 가격 입력
        int sangdeok = sc.nextInt();
        int jungdeok = sc.nextInt();
        int hadeok = sc.nextInt();

        // 두 개의 음료 가격 입력
        int cola = sc.nextInt();
        int cider = sc.nextInt();

        // 가장 저렴한 햄버거와 음료 찾기
        int minBurger = Math.min(sangdeok, Math.min(jungdeok, hadeok));
        int minDrink = Math.min(cola, cider);

        // 최저가 세트 메뉴 가격 계산
        int minSetPrice = minBurger + minDrink - 50;

        // 결과 출력
        System.out.println(minSetPrice);

        sc.close();
    }
}
