import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();  // 1년 전 키
        int B = sc.nextInt();  // 현재 키
        
        System.out.println(B - A);  // 성장한 키(cm)
        
        sc.close();
    }
}
