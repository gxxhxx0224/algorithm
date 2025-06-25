import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int side = (int) Math.pow(2, n) + 1;
        int result = side * side;

        System.out.println(result);
    }
}
