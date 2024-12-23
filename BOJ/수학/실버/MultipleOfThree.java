import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 값 읽기
        String x = sc.nextLine();
        int transformationCount = 0;

        // 변환 과정
        while (x.length() > 1) {
            int sum = 0;

            for (char c : x.toCharArray()) {
                sum += c - '0';
            }

            x = String.valueOf(sum);
            transformationCount++;
        }

        // 최종 결과
        int finalNumber = Integer.parseInt(x);
        System.out.println(transformationCount);
        System.out.println(finalNumber % 3 == 0 ? "YES" : "NO");

        sc.close();
    }
}
