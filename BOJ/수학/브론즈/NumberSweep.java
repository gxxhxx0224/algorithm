import java.util.Scanner;

public class Main {
    // 수를 뒤집는 메서드
    public static int reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    // 좌우 대칭 여부 확인
    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int reversed = reverse(N);
            int sum = N + reversed;

            if (isPalindrome(sum)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
