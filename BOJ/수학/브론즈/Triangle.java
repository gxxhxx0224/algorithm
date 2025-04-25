import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        
        double area = W * H / 2.0;
        
        System.out.printf("%.1f\n", area);
    }
}
