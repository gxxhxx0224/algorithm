import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        System.out.println(getManhattanDistance(a, b));
    }
    
    public static int getManhattanDistance(int a, int b) {
        int ax = (a - 1) / 4, ay = (a - 1) % 4;
        int bx = (b - 1) / 4, by = (b - 1) % 4;
        
        return Math.abs(ax - bx) + Math.abs(ay - by);
    }
}
