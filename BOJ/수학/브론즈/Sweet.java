import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int az = sc.nextInt();
        
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int cz = sc.nextInt();
        
        // b 계산하기
        int bx = cx - az;
        int by = cy / ay;
        int bz = cz - ax;
        
        // 결과 출력
        System.out.println(bx + " " + by + " " + bz);
        
        sc.close();
    }
}