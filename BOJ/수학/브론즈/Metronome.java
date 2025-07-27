import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 노래의 길이 (tick)
        double revolutions = n / 4.0; // 회전 수 계산

        System.out.printf("%.2f\n", revolutions); // 소수점 둘째자리까지 출력
    }
}
