import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int n = word.length();
        String result = null;

        // i: 첫 번째 나눌 위치, j: 두 번째 나눌 위치
        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // 세 부분으로 나누기
                String part1 = word.substring(0, i);
                String part2 = word.substring(i, j);
                String part3 = word.substring(j);

                // 각 부분 뒤집기
                String reversed = new StringBuilder(part1).reverse().toString()
                        + new StringBuilder(part2).reverse().toString()
                        + new StringBuilder(part3).reverse().toString();

                // 사전순으로 가장 앞서는 단어 업데이트
                if (result == null || reversed.compareTo(result) < 0) {
                    result = reversed;
                }
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}
