import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 입력 단어
        String banned = "CAMBRIDGE";  // 제거할 문자들
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // CAMBRIDGE에 포함되지 않은 문자만 추가
            if (banned.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
