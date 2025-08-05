import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Apples 점수 입력
        int apple3 = sc.nextInt();
        int apple2 = sc.nextInt();
        int apple1 = sc.nextInt();

        // Bananas 점수 입력
        int banana3 = sc.nextInt();
        int banana2 = sc.nextInt();
        int banana1 = sc.nextInt();

        // 각 팀의 총점 계산
        int appleScore = apple3 * 3 + apple2 * 2 + apple1;
        int bananaScore = banana3 * 3 + banana2 * 2 + banana1;

        // 승부 판별
        if (appleScore > bananaScore) {
            System.out.println("A");
        } else if (bananaScore > appleScore) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
