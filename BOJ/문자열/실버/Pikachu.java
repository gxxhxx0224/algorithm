import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        // "pi", "ka", "chu"를 제외한 다른 문자가 있는지 확인
        if (s.matches("(pi|ka|chu)*")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
