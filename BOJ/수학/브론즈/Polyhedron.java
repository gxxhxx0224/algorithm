import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수
        
        for (int i = 0; i < T; i++) {
            int V = sc.nextInt(); // 꼭짓점 수
            int E = sc.nextInt(); // 모서리 수
            
            int F = 2 - V + E; // 에우틀레르 공식으로 면의 수 계산
            System.out.println(F);
        }
    }
}
