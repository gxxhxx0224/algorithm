import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt(); // 비즈니스 클래스의 행 수
        int k1 = scanner.nextInt(); // 비즈니스 클래스의 행별 좌석 수
        int n2 = scanner.nextInt(); // 이코노미 클래스의 행 수
        int k2 = scanner.nextInt(); // 이코노미 클래스의 행별 좌석 수
        scanner.close();
        
        int totalSeats = (n1 * k1) + (n2 * k2); // 총 좌석 수 계산

        System.out.println(totalSeats);
    }
}
