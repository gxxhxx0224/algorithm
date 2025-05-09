import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // S와 A의 개수 입력받기
        int N = sc.nextInt(); // S 블록 개수
        int M = sc.nextInt(); // A 블록 개수

        // 각각 2개씩 필요하니 2로 나눈 뒤 더 작은 값을 출력
        int result = Math.min(N / 2, M / 2);
        System.out.println(result);
    }
}
