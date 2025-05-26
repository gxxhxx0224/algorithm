import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int bun = scanner.nextInt();  // 빵의 개수 A
        int patty = scanner.nextInt();  // 패티의 개수 B
        
        // 햄버거 1개: 빵 2개 + 패티 1개
        int maxBurgers = Math.min(bun / 2, patty);
        
        System.out.println(maxBurgers);
    }
}
