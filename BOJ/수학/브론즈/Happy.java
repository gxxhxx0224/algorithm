import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        int n = K / M; // 행 번호 계산
        int m = K % M; // 열 번호 계산
        
        System.out.println(n + " " + m);
        sc.close();
    }
}
