import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        
        System.out.println(Math.abs(N - M));
        
        scanner.close();
    }
}
