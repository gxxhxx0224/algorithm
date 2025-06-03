import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            BigDecimal price = new BigDecimal(sc.nextLine());
            BigDecimal discounted = price.multiply(new BigDecimal("0.80"));
            discounted = discounted.setScale(2, RoundingMode.HALF_UP);
            System.out.println("$" + discounted);
        }
    }
}
