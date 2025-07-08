import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 작업 개수
        int T = sc.nextInt(); // 총 가능한 시간
        
        int count = 0;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int time = sc.nextInt();
            if (sum + time <= T) {
                sum += time;
                count++;
            } else {
                break;
            }
        }
        
        System.out.println(count);
    }
}
