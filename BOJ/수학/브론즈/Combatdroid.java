import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 부품 단가
        double blasterRiflePrice = 350.34;
        double visualSensorPrice = 230.90;
        double auditorySensorPrice = 190.55;
        double armPrice = 125.30;
        double legPrice = 180.90;

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int E = sc.nextInt();

            double totalCost = A * blasterRiflePrice
                             + B * visualSensorPrice
                             + C * auditorySensorPrice
                             + D * armPrice
                             + E * legPrice;

            // 소수점 둘째자리까지, 달러표시 포함 출력
            System.out.printf("$%.2f\n", totalCost);
        }

        sc.close();
    }
}
