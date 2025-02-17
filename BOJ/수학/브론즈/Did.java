import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxPrize = 0;
        
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int prize = 0;
            
            if (a == b && b == c) {
                prize = 10000 + a * 1000;
            } else if (a == b || a == c) {
                prize = 1000 + a * 100;
            } else if (b == c) {
                prize = 1000 + b * 100;
            } else {
                prize = Math.max(a, Math.max(b, c)) * 100;
            }
            
            maxPrize = Math.max(maxPrize, prize);
        }
        
        System.out.println(maxPrize);
        sc.close();
    }
}
