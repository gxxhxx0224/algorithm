import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bowls = sc.nextLine();
        
        int height = 10; // 첫 그릇은 무조건 10cm
        for (int i = 1; i < bowls.length(); i++) {
            if (bowls.charAt(i) == bowls.charAt(i - 1)) {
                height += 5; // 같은 방향
            } else {
                height += 10; // 다른 방향
            }
        }

        System.out.println(height);
    }
}
