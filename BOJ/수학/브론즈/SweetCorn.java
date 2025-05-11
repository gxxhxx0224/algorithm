import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt(); // 부가세 포함 가격
        int A = B * 10 / 11;  // 부가세 제외 가격 (세전 가격)
        System.out.println(A);
    }
}
