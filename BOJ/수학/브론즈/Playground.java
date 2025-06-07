import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.141592;
        Scanner sc = new Scanner(System.in);
        
        int d1 = sc.nextInt();  // 직사각형 가로 길이
        int d2 = sc.nextInt();  // 반원의 반지름
        
        double perimeter = 2 * d1 + 2 * PI * d2;
        System.out.printf("%.6f\n", perimeter);
    }
}
