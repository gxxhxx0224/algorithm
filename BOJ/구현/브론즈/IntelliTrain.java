import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maxPassengers = 0;
        int currentPassengers = 0;
        
        for (int i = 0; i < 4; i++) {
            int out = sc.nextInt(); // 내린 사람 수
            int in = sc.nextInt();  // 탄 사람 수
            
            currentPassengers -= out;
            currentPassengers += in;
            
            maxPassengers = Math.max(maxPassengers, currentPassengers);
        }
        
        System.out.println(maxPassengers);
        sc.close();
    }
}
