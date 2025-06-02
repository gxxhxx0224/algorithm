import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 각 치킨 종류당 마릿수
        int A = sc.nextInt(); // 후라이드 선호 병사 수
        int B = sc.nextInt(); // 간장 선호 병사 수
        int C = sc.nextInt(); // 양념 선호 병사 수

        int result = Math.min(N, A) + Math.min(N, B) + Math.min(N, C);
        System.out.println(result);
    }
}
