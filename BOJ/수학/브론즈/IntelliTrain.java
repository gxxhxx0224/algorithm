import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxPeople = 0;
        int currentPeople = 0;
        
        for (int i = 0; i < 10; i++) {
            int off = sc.nextInt(); // 내리는 사람 수
            int on = sc.nextInt();  // 타는 사람 수
            
            currentPeople -= off; // 내리는 사람 먼저 반영
            currentPeople += on;  // 타는 사람 반영
            
            maxPeople = Math.max(maxPeople, currentPeople);
        }
        
        System.out.println(maxPeople);
        sc.close();
    }
}
